/******************************************************************************
 * Copyright (C) 2018 Logilite Technologies LLP								  *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/
package org.adempiere.impexp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Properties;
import java.util.logging.Level;

import org.apache.commons.compress.archivers.zip.Zip64Mode;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Footer;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.PrintSetup;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.compiere.model.MSysConfig;
import org.compiere.util.CLogger;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Language;
import org.compiere.util.Msg;
import org.compiere.util.Util;

/**
 * Abstract MS Excel Format (xlsx) Exporter
 * 
 * @author Deepak Pansheriya
 */
public abstract class AbstractXLSXExporter
{
	/**
	 * Is the current Row a Function Row
	 * 
	 * @return true if function row
	 */
	public abstract boolean isFunctionRow();

	/**
	 * Get Columns Count
	 * 
	 * @return number of columns
	 */
	public abstract int getColumnCount();

	/**
	 * Get Rows Count
	 * 
	 * @return number of rows
	 */
	public abstract int getRowCount();

	/**
	 * Set current row
	 * 
	 * @param row row index
	 */
	protected abstract void setCurrentRow(int row);

	/**
	 * @return current row index
	 */
	protected abstract int getCurrentRow();

	/**
	 * Check if column is printed (displayed)
	 * 
	 * @param col column index
	 * @return true if is visible
	 */
	public abstract boolean isColumnPrinted(int col);

	/**
	 * Get column header name
	 * 
	 * @param col column index
	 * @return header name
	 */
	public abstract String getHeaderName(int col);

	/**
	 * Get cell display type (see {@link DisplayType})
	 * 
	 * @param row row index
	 * @param col column index
	 * @return display type
	 */
	public abstract int getDisplayType(int row, int col);

	/**
	 * Get cell value
	 * 
	 * @param row row index
	 * @param col column index
	 * @return cell value
	 */
	public abstract Object getValueAt(int row, int col);

	/**
	 * Check if there is a page break on given cell
	 * 
	 * @param row row index
	 * @param col column index
	 * @return true if there is a page break
	 */
	public abstract boolean isPageBreak(int row, int col);
	
	/**
	 * Check if there is a display logic
	 * 
	 * @param row row index
	 * @param col column index
	 * @return true if there is no logic or evaluate logic specified in print item
	 */
	public abstract boolean isDisplayed(int row, int col);
	
	/** Logger */
	protected final CLogger					log				= CLogger.getCLogger(getClass());
	//
	protected Workbook					m_workbook;
	private boolean						m_isUseSXSSF;
	private DataFormat					m_dataFormat;
	private Font						m_fontHeader	= null;
	private Font						m_fontDefault	= null;
	protected Language						m_lang			= null;
	private int								m_sheetCount	= 0;
	//
	private int								m_colSplit		= 1;
	private int								m_rowSplit		= 1;
	private boolean							currentRowOnly	= false;
	/** Styles cache */
	private HashMap<String, CellStyle>	m_styles		= new HashMap<String, CellStyle>();

	protected Boolean[]						colSuppressRepeats;
	private int noOfParameter = 0;

	/**
	 * Default constructor
	 */
	public AbstractXLSXExporter()
	{
		m_isUseSXSSF = MSysConfig.getBooleanValue(MSysConfig.XLSX_EXPORT_USE_FAST_METHOD, true, Env.getAD_Client_ID(Env.getCtx()));
		if (m_isUseSXSSF) {
			m_workbook = new SXSSFWorkbook(null, SXSSFWorkbook.DEFAULT_WINDOW_SIZE, true, true);
			((SXSSFWorkbook)m_workbook).getXSSFWorkbook().getProperties().getCoreProperties().setCreator("iDempiere");
			((SXSSFWorkbook)m_workbook).setZip64Mode(Zip64Mode.Never);
		} else {
			m_workbook = new XSSFWorkbook();
		}
		m_dataFormat = m_workbook.createDataFormat();
	}

	protected Properties getCtx()
	{
		return Env.getCtx();
	}

	/**
	 * @param colSplit column index to freeze
	 * @param rowSplit row index to freeze
	 */
	protected void setFreezePane(int colSplit, int rowSplit)
	{
		m_colSplit = colSplit;
		m_rowSplit = rowSplit;
	}

	/**
	 * @return Language
	 */
	protected Language getLanguage()
	{
		if (m_lang == null)
			m_lang = Env.getLanguage(getCtx());
		return m_lang;
	}

	/**
	 * @param isHeader
	 * @return XSSFFont
	 */
	private Font getFont(boolean isHeader)
	{
		Font font = null;
		if (isHeader)
		{
			if (m_fontHeader == null)
			{
				m_fontHeader = m_workbook.createFont();
				m_fontHeader.setBold(true);
			}
			font = m_fontHeader;
		}
		else if (isFunctionRow())
		{
			font = m_workbook.createFont();
			font.setBold(true);
			font.setItalic(true);
		}
		else
		{
			if (m_fontDefault == null)
			{
				m_fontDefault = m_workbook.createFont();
			}
			font = m_fontDefault;
		}
		return font;
	}

	/**
	 * Get Excel number format string by given {@link NumberFormat}
	 * 
	 * @param df number format
	 * @param isHighlightNegativeNumbers highlight negative numbers using RED
	 *            color
	 * @return excel format pattern
	 */
	private String getFormatString(NumberFormat df, boolean isHighlightNegativeNumbers)
	{
		StringBuilder format = new StringBuilder();
		int integerDigitsMin = df.getMinimumIntegerDigits();
		int integerDigitsMax = df.getMaximumIntegerDigits();
		for (int i = 0; i < integerDigitsMax; i++)
		{
			if (i < integerDigitsMin)
				format.insert(0, "0");
			else
				format.insert(0, "#");
			if (i == 2)
			{
				format.insert(0, ",");
			}
		}
		int fractionDigitsMin = df.getMinimumFractionDigits();
		int fractionDigitsMax = df.getMaximumFractionDigits();
		for (int i = 0; i < fractionDigitsMax; i++)
		{
			if (i == 0)
				format.append(".");
			if (i < fractionDigitsMin)
				format.append("0");
			else
				format.append("#");
		}
		if (isHighlightNegativeNumbers)
		{
			String f = format.toString();
			format = new StringBuilder(f).append(";[RED]-").append(f);
		}
		//
		if (log.isLoggable(Level.FINEST))
			log.finest("NumberFormat: " + format);
		return format.toString();

	}

	/**
	 * @param row
	 * @param col
	 * @return CellStyle
	 */
	private CellStyle getStyle(int row, int col)
	{
		int displayType = getDisplayType(row, col);
		String key = "cell-" + col + "-" + displayType;
		CellStyle cs = m_styles.get(key);
		if (cs == null)
		{
			cs = m_workbook.createCellStyle();
			Font font = getFont(false);
			cs.setFont(font);
			// Border
			cs.setBorderLeft(BorderStyle.THIN);
			cs.setBorderTop(BorderStyle.THIN);
			cs.setBorderRight(BorderStyle.THIN);
			cs.setBorderBottom(BorderStyle.THIN);
			//
			String cellFormat = getCellFormat(row, col);
			if (cellFormat != null)
				cs.setDataFormat(m_dataFormat.getFormat(cellFormat));
			m_styles.put(key, cs);
		}
		return cs;
	}

	/**
	 * @param row
	 * @param col
	 * @return Excel format pattern for cell
	 */
	protected String getCellFormat(int row, int col) {
		boolean isHighlightNegativeNumbers = true;
		int displayType = getDisplayType(row, col);
		String cellFormat = null;
		
		if (DisplayType.isDate(displayType)) {
			cellFormat = DisplayType.getDateFormat(getLanguage()).toPattern();
		} else if (DisplayType.isNumeric(displayType)) {
			DecimalFormat df = DisplayType.getNumberFormat(displayType, getLanguage());
			cellFormat = getFormatString(df, isHighlightNegativeNumbers);
		}
		
		return cellFormat;
	}
	
	/**
	 * @param col
	 * @return XSSFCellStyle for column
	 */
	private CellStyle getHeaderStyle(int col)
	{
		String key = "header-" + col;
		CellStyle cs_header = m_styles.get(key);
		if (cs_header == null)
		{
			Font font_header = getFont(true);
			cs_header = m_workbook.createCellStyle();
			cs_header.setFont(font_header);
			cs_header.setBorderLeft(BorderStyle.MEDIUM);
			cs_header.setBorderTop(BorderStyle.MEDIUM);
			cs_header.setBorderRight(BorderStyle.MEDIUM);
			cs_header.setBorderBottom(BorderStyle.MEDIUM);
			cs_header.setDataFormat(m_workbook.createDataFormat().getFormat("text"));
			cs_header.setWrapText(true);
			m_styles.put(key, cs_header);
		}
		return cs_header;
	}

	/**
	 * auto size column
	 * @param sheet
	 * @param lastColumnIndex
	 */
	private void fixColumnWidth(Sheet sheet, int colCount)
	{
		if (m_isUseSXSSF) {
			// using streaming SXSSFWorkbook, the autoSizeColumn is not available
			// so, we need to figure a default size depending on the display type
			//  default here to:
			//     10 characters for date fields
			//     12 for numeric
			//      5 for boolean
			//     20 for all others
			int colnum = 0;
			for (int col = 0; col < getColumnCount(); col++) {				
				if (isColumnPrinted(col)) {
					int dt = getDisplayType(0, col);
					int width = 20*256;
					if (DisplayType.isDate(dt))
						width = 10*256;
					else if (DisplayType.isNumeric(dt))
						width = 12*256;
					else if (dt == DisplayType.YesNo)
						width = 5*256;
					sheet.setColumnWidth(colnum, width);
					colnum++;
				}
			}
		} else {
			for (short colnum = 0; colnum < colCount; colnum++)
			{
				sheet.autoSizeColumn(colnum);
			}
		}

	}

	/**
	 * Update sheet setting prior to closing it
	 * @param prevSheet
	 * @param prevSheetName
	 * @param colCount
	 */
	private void closeTableSheet(Sheet prevSheet, String prevSheetName, int colCount)
	{
		if (prevSheet == null)
			return;
		//
		fixColumnWidth(prevSheet, colCount);
		if ((m_colSplit >= 0 || m_rowSplit >= 0) && !isForm())
			prevSheet.createFreezePane(m_colSplit >= 0 ? m_colSplit : 0, m_rowSplit >= 0 ? m_rowSplit : 0);
		if (!Util.isEmpty(prevSheetName, true) && m_sheetCount > 0)
		{
			int prevSheetIndex = m_sheetCount - 1;
			try
			{
				m_workbook.setSheetName(prevSheetIndex, prevSheetName);
			}
			catch (Exception e)
			{
				log.log(Level.WARNING, "Error setting sheet " + prevSheetIndex + " name to " + prevSheetName, e);
			}
		}
	}

	/**
	 * Create new sheet
	 * @return Sheet
	 */
	private Sheet createTableSheet()
	{
		Sheet sheet = m_workbook.createSheet();
		formatPage(sheet);
		createHeaderFooter(sheet);
		createParameter(sheet);
		if (!isForm())
		{
			createTableHeader(sheet);
		}
		m_sheetCount++;
		//
		return sheet;
	}

	/**
	 * @param sheet
	 */
	private void createTableHeader(Sheet sheet)
	{
		createTableHeader(sheet, Math.max(noOfParameter, 0));
	}
	
	/**
	 * @param sheet
	 * @param headerRowNum
	 */
	private void createTableHeader(Sheet sheet, int headerRowNum)
	{
		int colnumMax = 0;

		Row row = sheet.createRow(headerRowNum);
		// for all columns
		int colnum = 0;
		for (int col = 0; col < getColumnCount(); col++)
		{
			if (colnum > colnumMax)
				colnumMax = colnum;
			//
			if (isColumnPrinted(col))
			{
				Cell cell = row.createCell(colnum);
				// header row
				CellStyle style = getHeaderStyle(col);
				cell.setCellStyle(style);
				String str = getHeaderName(col);
				cell.setCellValue(new XSSFRichTextString(str));
				colnum++;
			} // printed
		} // for all columns
	}

	protected void createHeaderFooter(Sheet sheet)
	{
		// Sheet Header
		Header header = sheet.getHeader();
		//&P == current page number
	    //&N == page numbers
		header.setRight("&P / &N");
		// Sheet Footer
		Footer footer = sheet.getFooter();
		footer.setLeft(Env.getStandardReportFooterTrademarkText());
		String s = MSysConfig.getValue(MSysConfig.ZK_FOOTER_SERVER_MSG, "", Env.getAD_Client_ID(Env.getCtx()));
		if (Util.isEmpty(s, true))
			footer.setCenter(Env.getHeader(getCtx(), 0));	
		else
			footer.setCenter(Msg.parseTranslation(Env.getCtx(), s));
		Timestamp now = new Timestamp(System.currentTimeMillis());
		s = MSysConfig.getValue(MSysConfig.ZK_FOOTER_SERVER_DATETIME_FORMAT, Env.getAD_Client_ID(Env.getCtx()));
		if (!Util.isEmpty(s, true))
			footer.setRight(new SimpleDateFormat(s).format(System.currentTimeMillis()));
		else
			footer.setRight(DisplayType.getDateFormat(DisplayType.DateTime, getLanguage()).format(now));
	}

	/**
	 * Format sheet
	 * @param sheet
	 */
	protected void formatPage(Sheet sheet)
	{
		sheet.setFitToPage(true);
		// Print Setup
		PrintSetup ps;
		if (m_isUseSXSSF)
			ps = ((SXSSFSheet)sheet).getPrintSetup();
		else
			ps = ((XSSFSheet)sheet).getPrintSetup();
		ps.setFitWidth((short) 1);
		ps.setNoColor(true);
		ps.setPaperSize(PrintSetup.A4_PAPERSIZE);
		ps.setLandscape(false);
	}

	/**
	 * @return true if export current record only
	 */
	protected boolean isCurrentRowOnly()
	{
		return currentRowOnly;
	}

	/**
	 * @param b
	 */
	protected void setCurrentRowOnly(boolean b)
	{
		currentRowOnly = b;
	}

	/**
	 * Export to given stream
	 * 
	 * @param out
	 * @throws Exception
	 */
	protected void export(OutputStream out) throws Exception
	{
		Sheet sheet = null;
		if (out != null) 
		{
			sheet = createTableSheet();
		}
		else  
		{
			m_dataFormat = m_workbook.createDataFormat();
			sheet = m_workbook.getSheetAt(0);
			createTableHeader(sheet, sheet.getLastRowNum()+2);
		}
		String sheetName = null;
		//
		int colnumMax = 0;
		int rownum = isCurrentRowOnly() ? getCurrentRow() : 0;
		int lastRowNum = isCurrentRowOnly() ? getCurrentRow() + 1 : getRowCount();
		Object[] preValues = null;
		int printColIndex = -1;
		if (colSuppressRepeats != null)
		{
			preValues = new Object[colSuppressRepeats.length];
		}

		int initxls_rownum = 0;
		if (out != null)
			initxls_rownum = Math.max(noOfParameter+1, 1);
		else 
			initxls_rownum = Math.max(noOfParameter+1, sheet.getLastRowNum()+1);
		
		for (int xls_rownum = initxls_rownum; rownum < lastRowNum; rownum++, xls_rownum++)
		{
			if (!isCurrentRowOnly())
				setCurrentRow(rownum);

			boolean isPageBreak = false;
			Row row = sheet.createRow(xls_rownum);
			printColIndex = -1;
			// for all columns
			int colnum = 0;
			for (int col = 0; col < getColumnCount(); col++)
			{				
				//
				if (isColumnPrinted(col))
				{
					printColIndex++;
					Cell cell = null;
					// line row
					Object obj = getValueAt(rownum, col);
					if (isForm())
					{
						if (isVisible(rownum, col) && (!isSuppressNull(col) || (obj != null && !Util.isEmpty(obj.toString(), true))))
						{
							row = getFormRow(sheet, col);
							cell = getFormCell(row, col);
							String label = getHeaderName(col);
							if (!Util.isEmpty(label, true))
							{
								cell.setCellValue(new XSSFRichTextString(label));
								int index = cell.getColumnIndex()+1;
								cell = row.getCell(index);
								if (cell == null)
									cell = row.createCell(index);
							}
						}
						else if (isSetFormRowPosition(col))
						{
							row = getFormRow(sheet, col);
						}
					}
					else
					{
						cell = row.createCell(colnum);
					}
					
					int displayType = getDisplayType(rownum, col);
					if (obj == null || !isDisplayed(rownum, col))
					{
						if (colSuppressRepeats != null && colSuppressRepeats[printColIndex])
						{
							preValues[printColIndex] = null;
						}
					}
					else if (colSuppressRepeats != null && colSuppressRepeats[printColIndex]
							&& obj.equals(preValues[printColIndex]))
					{
						// suppress
					}
					else if (!isVisible(rownum, col)) 
					{
						;
					}
					else if (DisplayType.isDate(displayType))
					{
						Timestamp value = null;
						if (obj instanceof Date)
							value = new Timestamp(((Date)obj).getTime());
						else
							value = (Timestamp)obj;
						cell.setCellValue(value);
					}
					else if (DisplayType.isNumeric(displayType))
					{
						double value = 0;
						if (obj instanceof Number)
						{
							value = ((Number) obj).doubleValue();
						}
						cell.setCellValue(value);
					}
					else if (DisplayType.YesNo == displayType)
					{
						boolean value = false;
						if (obj instanceof Boolean)
							value = (Boolean) obj;
						else
							value = "Y".equals(obj);
						cell.setCellValue(new XSSFRichTextString(Msg.getMsg(getLanguage(), value == true ? "Y" : "N")));
					}
					else
					{
						String value = obj.toString(); // formatted
						cell.setCellValue(new XSSFRichTextString(value));
					}
					//
					if (cell != null) 
					{
						CellStyle style = getStyle(rownum, col);
						if (isForm())
							style.setWrapText(true);
						cell.setCellStyle(style);
					}
					// Page break
					if (isPageBreak(rownum, col))
					{
						isPageBreak = true;
						sheetName = cell.getRichStringCellValue().getString();
					}
					//
					colnum++;
					if (colnum > colnumMax)
						colnumMax = colnum;
					if (colSuppressRepeats != null)
						preValues[printColIndex] = obj;
				} // printed
			} // for all columns
				//
				// Page Break
			if (isPageBreak)
			{
				closeTableSheet(sheet, sheetName, colnumMax);
				sheet = createTableSheet();
				xls_rownum = 0;
				isPageBreak = false;
			}
		} // for all rows
		if (out == null)
			fixColumnWidth(sheet, colnumMax);
		else
			closeTableSheet(sheet, sheetName, colnumMax);
		//

		if (out != null)
		{
			m_workbook.write(out);
			out.close();
		}

		//
		// Workbook Info
		if (log.isLoggable(Level.FINE))
		{
			log.fine("Sheets #" + m_sheetCount);
			log.fine("Styles used #" + m_styles.size());
		}
	}

	/**
	 * Export to file
	 * 
	 * @param file
	 * @param language reporting language
	 * @throws Exception
	 */
	public void export(File file, Language language) throws Exception
	{
		export(file, language, true);
	}

	/**
	 * Export to file
	 * 
	 * @param file
	 * @param language reporting language
	 * @param autoOpen auto open file after generated
	 * @throws Exception
	 */
	public void export(File file, Language language, boolean autoOpen) throws Exception
	{
		m_lang = language;
		if (file == null)
			file = File.createTempFile("Report_", ".xlsx");
		FileOutputStream out = new FileOutputStream(file);
		export(out);
		if (autoOpen && Ini.isClient())
			Env.startBrowser(file.toURI().toString());
	}

	/**
	 * Export to workbook
	 * @param workbook
	 * @param language
	 * @throws Exception
	 */
	public void exportToWorkbook(Workbook workbook, Language language) throws Exception
	{
		m_lang = language;
		m_workbook = workbook;
		export(null);
	}
	
	/**
	 * @return true if it is form layout
	 */
	protected boolean isForm()
	{
		return false;
	}
	
	/**
	 * @return number of parameter
	 */
	protected int getNoOfParameter()
	{
		return noOfParameter;
	}

	/**
	 * @param noOfParameter
	 */
	protected void setNoOfParameter(int noOfParameter)
	{
		this.noOfParameter = noOfParameter;
	}
		
	/**
	 * Create parameter
	 * @param sheet
	 */
	protected void createParameter(Sheet sheet)
	{
		
	}
	
	/**
	 * @param row
	 * @param col
	 * @return true if cell is visible
	 */
	protected boolean isVisible(int row, int col)
	{
		return true;
	}
	
	/**
	 * @param col
	 * @return true if column should be hidden when it is null
	 */
	protected boolean isSuppressNull(int col) {
		return false;
	}
	
	/**
	 * @param col
	 * @return true if column is use to set new row position
	 */
	protected boolean isSetFormRowPosition(int col) {
		return false;
	}
	
	/**
	 * get cell for column. use for form layout
	 * @param row
	 * @param colnum
	 * @return cell for column
	 */
	protected Cell getFormCell(Row row, int colnum) {
		return null;
	}

	/**
	 * get row for column. use for form layout
	 * @param sheet
	 * @param colnum
	 * @return row for column
	 */
	protected Row getFormRow(Sheet sheet, int colnum) {
		return null;
	}
}
