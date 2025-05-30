/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.util.KeyNamePair;

/** Generated Model for AD_InfoColumn
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="AD_InfoColumn")
public class X_AD_InfoColumn extends PO implements I_AD_InfoColumn, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_AD_InfoColumn (Properties ctx, int AD_InfoColumn_ID, String trxName)
    {
      super (ctx, AD_InfoColumn_ID, trxName);
      /** if (AD_InfoColumn_ID == 0)
        {
			setAD_InfoColumn_ID (0);
			setAD_InfoWindow_ID (0);
			setAD_Reference_ID (0);
			setColumnName (null);
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setIsAutocomplete (false);
// N
			setIsCentrallyMaintained (true);
// Y
			setIsDisplayed (true);
// Y
			setIsIdentifier (false);
// N
			setIsMandatory (false);
// N
			setIsQueryAfterChange (false);
// N
			setIsQueryCriteria (false);
			setIsRange (false);
// N
			setIsReadOnly (true);
// Y
			setName (null);
			setSelectClause (null);
			setSeqNo (0);
// @SQL=SELECT NVL(MAX(SeqNo),0)+10 AS DefaultValue FROM AD_InfoColumn WHERE AD_InfoWindow_ID=@AD_InfoWindow_ID@
        } */
    }

    /** Standard Constructor */
    public X_AD_InfoColumn (Properties ctx, int AD_InfoColumn_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_InfoColumn_ID, trxName, virtualColumns);
      /** if (AD_InfoColumn_ID == 0)
        {
			setAD_InfoColumn_ID (0);
			setAD_InfoWindow_ID (0);
			setAD_Reference_ID (0);
			setColumnName (null);
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setIsAutocomplete (false);
// N
			setIsCentrallyMaintained (true);
// Y
			setIsDisplayed (true);
// Y
			setIsIdentifier (false);
// N
			setIsMandatory (false);
// N
			setIsQueryAfterChange (false);
// N
			setIsQueryCriteria (false);
			setIsRange (false);
// N
			setIsReadOnly (true);
// Y
			setName (null);
			setSelectClause (null);
			setSeqNo (0);
// @SQL=SELECT NVL(MAX(SeqNo),0)+10 AS DefaultValue FROM AD_InfoColumn WHERE AD_InfoWindow_ID=@AD_InfoWindow_ID@
        } */
    }

    /** Standard Constructor */
    public X_AD_InfoColumn (Properties ctx, String AD_InfoColumn_UU, String trxName)
    {
      super (ctx, AD_InfoColumn_UU, trxName);
      /** if (AD_InfoColumn_UU == null)
        {
			setAD_InfoColumn_ID (0);
			setAD_InfoWindow_ID (0);
			setAD_Reference_ID (0);
			setColumnName (null);
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setIsAutocomplete (false);
// N
			setIsCentrallyMaintained (true);
// Y
			setIsDisplayed (true);
// Y
			setIsIdentifier (false);
// N
			setIsMandatory (false);
// N
			setIsQueryAfterChange (false);
// N
			setIsQueryCriteria (false);
			setIsRange (false);
// N
			setIsReadOnly (true);
// Y
			setName (null);
			setSelectClause (null);
			setSeqNo (0);
// @SQL=SELECT NVL(MAX(SeqNo),0)+10 AS DefaultValue FROM AD_InfoColumn WHERE AD_InfoWindow_ID=@AD_InfoWindow_ID@
        } */
    }

    /** Standard Constructor */
    public X_AD_InfoColumn (Properties ctx, String AD_InfoColumn_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_InfoColumn_UU, trxName, virtualColumns);
      /** if (AD_InfoColumn_UU == null)
        {
			setAD_InfoColumn_ID (0);
			setAD_InfoWindow_ID (0);
			setAD_Reference_ID (0);
			setColumnName (null);
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setIsAutocomplete (false);
// N
			setIsCentrallyMaintained (true);
// Y
			setIsDisplayed (true);
// Y
			setIsIdentifier (false);
// N
			setIsMandatory (false);
// N
			setIsQueryAfterChange (false);
// N
			setIsQueryCriteria (false);
			setIsRange (false);
// N
			setIsReadOnly (true);
// Y
			setName (null);
			setSelectClause (null);
			setSeqNo (0);
// @SQL=SELECT NVL(MAX(SeqNo),0)+10 AS DefaultValue FROM AD_InfoColumn WHERE AD_InfoWindow_ID=@AD_InfoWindow_ID@
        } */
    }

    /** Load Constructor */
    public X_AD_InfoColumn (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 4 - System
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_AD_InfoColumn[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_Element getAD_Element() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Element)MTable.get(getCtx(), org.compiere.model.I_AD_Element.Table_ID)
			.getPO(getAD_Element_ID(), get_TrxName());
	}

	/** Set System Element.
		@param AD_Element_ID System Element enables the central maintenance of column description and help.
	*/
	public void setAD_Element_ID (int AD_Element_ID)
	{
		if (AD_Element_ID < 1)
			set_Value (COLUMNNAME_AD_Element_ID, null);
		else
			set_Value (COLUMNNAME_AD_Element_ID, Integer.valueOf(AD_Element_ID));
	}

	/** Get System Element.
		@return System Element enables the central maintenance of column description and help.
	  */
	public int getAD_Element_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Element_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_Style getAD_FieldStyle() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Style)MTable.get(getCtx(), org.compiere.model.I_AD_Style.Table_ID)
			.getPO(getAD_FieldStyle_ID(), get_TrxName());
	}

	/** Set Field Style.
		@param AD_FieldStyle_ID Field CSS Style 
	*/
	public void setAD_FieldStyle_ID (int AD_FieldStyle_ID)
	{
		if (AD_FieldStyle_ID < 1)
			set_Value (COLUMNNAME_AD_FieldStyle_ID, null);
		else
			set_Value (COLUMNNAME_AD_FieldStyle_ID, Integer.valueOf(AD_FieldStyle_ID));
	}

	/** Get Field Style.
		@return Field CSS Style 
	  */
	public int getAD_FieldStyle_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_FieldStyle_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Info Column.
		@param AD_InfoColumn_ID Info Window Column
	*/
	public void setAD_InfoColumn_ID (int AD_InfoColumn_ID)
	{
		if (AD_InfoColumn_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_InfoColumn_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_InfoColumn_ID, Integer.valueOf(AD_InfoColumn_ID));
	}

	/** Get Info Column.
		@return Info Window Column
	  */
	public int getAD_InfoColumn_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_InfoColumn_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AD_InfoColumn_UU.
		@param AD_InfoColumn_UU AD_InfoColumn_UU
	*/
	public void setAD_InfoColumn_UU (String AD_InfoColumn_UU)
	{
		set_Value (COLUMNNAME_AD_InfoColumn_UU, AD_InfoColumn_UU);
	}

	/** Get AD_InfoColumn_UU.
		@return AD_InfoColumn_UU	  */
	public String getAD_InfoColumn_UU()
	{
		return (String)get_Value(COLUMNNAME_AD_InfoColumn_UU);
	}

	public org.compiere.model.I_AD_InfoWindow getAD_InfoWindow() throws RuntimeException
	{
		return (org.compiere.model.I_AD_InfoWindow)MTable.get(getCtx(), org.compiere.model.I_AD_InfoWindow.Table_ID)
			.getPO(getAD_InfoWindow_ID(), get_TrxName());
	}

	/** Set Info Window.
		@param AD_InfoWindow_ID Info and search/select Window
	*/
	public void setAD_InfoWindow_ID (int AD_InfoWindow_ID)
	{
		if (AD_InfoWindow_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_InfoWindow_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_InfoWindow_ID, Integer.valueOf(AD_InfoWindow_ID));
	}

	/** Get Info Window.
		@return Info and search/select Window
	  */
	public int getAD_InfoWindow_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_InfoWindow_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_Reference getAD_Reference() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Reference)MTable.get(getCtx(), org.compiere.model.I_AD_Reference.Table_ID)
			.getPO(getAD_Reference_ID(), get_TrxName());
	}

	/** Set Reference.
		@param AD_Reference_ID System Reference and Validation
	*/
	public void setAD_Reference_ID (int AD_Reference_ID)
	{
		if (AD_Reference_ID < 1)
			set_Value (COLUMNNAME_AD_Reference_ID, null);
		else
			set_Value (COLUMNNAME_AD_Reference_ID, Integer.valueOf(AD_Reference_ID));
	}

	/** Get Reference.
		@return System Reference and Validation
	  */
	public int getAD_Reference_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_Reference getAD_Reference_Value() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Reference)MTable.get(getCtx(), org.compiere.model.I_AD_Reference.Table_ID)
			.getPO(getAD_Reference_Value_ID(), get_TrxName());
	}

	/** Set Reference Key.
		@param AD_Reference_Value_ID Required to specify, if data type is Table or List
	*/
	public void setAD_Reference_Value_ID (int AD_Reference_Value_ID)
	{
		if (AD_Reference_Value_ID < 1)
			set_Value (COLUMNNAME_AD_Reference_Value_ID, null);
		else
			set_Value (COLUMNNAME_AD_Reference_Value_ID, Integer.valueOf(AD_Reference_Value_ID));
	}

	/** Get Reference Key.
		@return Required to specify, if data type is Table or List
	  */
	public int getAD_Reference_Value_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_Value_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_Val_Rule getAD_Val_Rule() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Val_Rule)MTable.get(getCtx(), org.compiere.model.I_AD_Val_Rule.Table_ID)
			.getPO(getAD_Val_Rule_ID(), get_TrxName());
	}

	/** Set Dynamic Validation.
		@param AD_Val_Rule_ID Dynamic Validation Rule
	*/
	public void setAD_Val_Rule_ID (int AD_Val_Rule_ID)
	{
		if (AD_Val_Rule_ID < 1)
			set_Value (COLUMNNAME_AD_Val_Rule_ID, null);
		else
			set_Value (COLUMNNAME_AD_Val_Rule_ID, Integer.valueOf(AD_Val_Rule_ID));
	}

	/** Get Dynamic Validation.
		@return Dynamic Validation Rule
	  */
	public int getAD_Val_Rule_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Val_Rule_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set DB Column Name.
		@param ColumnName Name of the column in the database
	*/
	public void setColumnName (String ColumnName)
	{
		set_Value (COLUMNNAME_ColumnName, ColumnName);
	}

	/** Get DB Column Name.
		@return Name of the column in the database
	  */
	public String getColumnName()
	{
		return (String)get_Value(COLUMNNAME_ColumnName);
	}

	/** Set Default Logic.
		@param DefaultValue Default value hierarchy, separated by ;
	*/
	public void setDefaultValue (String DefaultValue)
	{
		set_Value (COLUMNNAME_DefaultValue, DefaultValue);
	}

	/** Get Default Logic.
		@return Default value hierarchy, separated by ;
	  */
	public String getDefaultValue()
	{
		return (String)get_Value(COLUMNNAME_DefaultValue);
	}

	/** Set Default Logic 2.
		@param DefaultValue2 Default value hierarchy, separated by ;
	*/
	public void setDefaultValue2 (String DefaultValue2)
	{
		set_Value (COLUMNNAME_DefaultValue2, DefaultValue2);
	}

	/** Get Default Logic 2.
		@return Default value hierarchy, separated by ;
	  */
	public String getDefaultValue2()
	{
		return (String)get_Value(COLUMNNAME_DefaultValue2);
	}

	/** Set Description.
		@param Description Optional short description of the record
	*/
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription()
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Display Logic.
		@param DisplayLogic If the Field is displayed, the result determines if the field is actually displayed
	*/
	public void setDisplayLogic (String DisplayLogic)
	{
		set_Value (COLUMNNAME_DisplayLogic, DisplayLogic);
	}

	/** Get Display Logic.
		@return If the Field is displayed, the result determines if the field is actually displayed
	  */
	public String getDisplayLogic()
	{
		return (String)get_Value(COLUMNNAME_DisplayLogic);
	}

	/** EntityType AD_Reference_ID=389 */
	public static final int ENTITYTYPE_AD_Reference_ID=389;
	/** Set Entity Type.
		@param EntityType Dictionary Entity Type; Determines ownership and synchronization
	*/
	public void setEntityType (String EntityType)
	{

		set_Value (COLUMNNAME_EntityType, EntityType);
	}

	/** Get Entity Type.
		@return Dictionary Entity Type; Determines ownership and synchronization
	  */
	public String getEntityType()
	{
		return (String)get_Value(COLUMNNAME_EntityType);
	}

	/** Set Comment/Help.
		@param Help Comment or Hint
	*/
	public void setHelp (String Help)
	{
		set_Value (COLUMNNAME_Help, Help);
	}

	/** Get Comment/Help.
		@return Comment or Hint
	  */
	public String getHelp()
	{
		return (String)get_Value(COLUMNNAME_Help);
	}

	/** Set Input field validation.
		@param InputFieldValidation Input field validation query
	*/
	public void setInputFieldValidation (String InputFieldValidation)
	{
		set_Value (COLUMNNAME_InputFieldValidation, InputFieldValidation);
	}

	/** Get Input field validation.
		@return Input field validation query
	  */
	public String getInputFieldValidation()
	{
		return (String)get_Value(COLUMNNAME_InputFieldValidation);
	}

	/** Set Auto complete.
		@param IsAutocomplete Automatic completion for text fields
	*/
	public void setIsAutocomplete (boolean IsAutocomplete)
	{
		set_Value (COLUMNNAME_IsAutocomplete, Boolean.valueOf(IsAutocomplete));
	}

	/** Get Auto complete.
		@return Automatic completion for text fields
	  */
	public boolean isAutocomplete()
	{
		Object oo = get_Value(COLUMNNAME_IsAutocomplete);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Centrally maintained.
		@param IsCentrallyMaintained Information maintained in System Element table
	*/
	public void setIsCentrallyMaintained (boolean IsCentrallyMaintained)
	{
		set_Value (COLUMNNAME_IsCentrallyMaintained, Boolean.valueOf(IsCentrallyMaintained));
	}

	/** Get Centrally maintained.
		@return Information maintained in System Element table
	  */
	public boolean isCentrallyMaintained()
	{
		Object oo = get_Value(COLUMNNAME_IsCentrallyMaintained);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Displayed.
		@param IsDisplayed Determines, if this field is displayed
	*/
	public void setIsDisplayed (boolean IsDisplayed)
	{
		set_Value (COLUMNNAME_IsDisplayed, Boolean.valueOf(IsDisplayed));
	}

	/** Get Displayed.
		@return Determines, if this field is displayed
	  */
	public boolean isDisplayed()
	{
		Object oo = get_Value(COLUMNNAME_IsDisplayed);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Identifier.
		@param IsIdentifier This column is part of the record identifier
	*/
	public void setIsIdentifier (boolean IsIdentifier)
	{
		set_Value (COLUMNNAME_IsIdentifier, Boolean.valueOf(IsIdentifier));
	}

	/** Get Identifier.
		@return This column is part of the record identifier
	  */
	public boolean isIdentifier()
	{
		Object oo = get_Value(COLUMNNAME_IsIdentifier);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Key column.
		@param IsKey This column is the key in this table
	*/
	public void setIsKey (boolean IsKey)
	{
		set_Value (COLUMNNAME_IsKey, Boolean.valueOf(IsKey));
	}

	/** Get Key column.
		@return This column is the key in this table
	  */
	public boolean isKey()
	{
		Object oo = get_Value(COLUMNNAME_IsKey);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Mandatory.
		@param IsMandatory Data entry is required in this column
	*/
	public void setIsMandatory (boolean IsMandatory)
	{
		set_Value (COLUMNNAME_IsMandatory, Boolean.valueOf(IsMandatory));
	}

	/** Get Mandatory.
		@return Data entry is required in this column
	  */
	public boolean isMandatory()
	{
		Object oo = get_Value(COLUMNNAME_IsMandatory);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Query After Change.
		@param IsQueryAfterChange Issues a query request after the user has made changes to the field
	*/
	public void setIsQueryAfterChange (boolean IsQueryAfterChange)
	{
		set_Value (COLUMNNAME_IsQueryAfterChange, Boolean.valueOf(IsQueryAfterChange));
	}

	/** Get Query After Change.
		@return Issues a query request after the user has made changes to the field
	  */
	public boolean isQueryAfterChange()
	{
		Object oo = get_Value(COLUMNNAME_IsQueryAfterChange);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Query Criteria.
		@param IsQueryCriteria The column is also used as a query criteria
	*/
	public void setIsQueryCriteria (boolean IsQueryCriteria)
	{
		set_Value (COLUMNNAME_IsQueryCriteria, Boolean.valueOf(IsQueryCriteria));
	}

	/** Get Query Criteria.
		@return The column is also used as a query criteria
	  */
	public boolean isQueryCriteria()
	{
		Object oo = get_Value(COLUMNNAME_IsQueryCriteria);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Range.
		@param IsRange The parameter is a range of values
	*/
	public void setIsRange (boolean IsRange)
	{
		set_Value (COLUMNNAME_IsRange, Boolean.valueOf(IsRange));
	}

	/** Get Range.
		@return The parameter is a range of values
	  */
	public boolean isRange()
	{
		Object oo = get_Value(COLUMNNAME_IsRange);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Read Only.
		@param IsReadOnly Field is read only
	*/
	public void setIsReadOnly (boolean IsReadOnly)
	{
		set_Value (COLUMNNAME_IsReadOnly, Boolean.valueOf(IsReadOnly));
	}

	/** Get Read Only.
		@return Field is read only
	  */
	public boolean isReadOnly()
	{
		Object oo = get_Value(COLUMNNAME_IsReadOnly);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Name.
		@param Name Alphanumeric identifier of the entity
	*/
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName()
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getName());
    }

	/** Set Placeholder.
		@param Placeholder Placeholder
	*/
	public void setPlaceholder (String Placeholder)
	{
		set_Value (COLUMNNAME_Placeholder, Placeholder);
	}

	/** Get Placeholder.
		@return Placeholder	  */
	public String getPlaceholder()
	{
		return (String)get_Value(COLUMNNAME_Placeholder);
	}

	/** Set Placeholder2.
		@param Placeholder2 Placeholder2
	*/
	public void setPlaceholder2 (String Placeholder2)
	{
		set_Value (COLUMNNAME_Placeholder2, Placeholder2);
	}

	/** Get Placeholder2.
		@return Placeholder2	  */
	public String getPlaceholder2()
	{
		return (String)get_Value(COLUMNNAME_Placeholder2);
	}

	/** Set Query Function.
		@param QueryFunction Database function for query
	*/
	public void setQueryFunction (String QueryFunction)
	{
		set_Value (COLUMNNAME_QueryFunction, QueryFunction);
	}

	/** Get Query Function.
		@return Database function for query
	  */
	public String getQueryFunction()
	{
		return (String)get_Value(COLUMNNAME_QueryFunction);
	}

	/** QueryOperator AD_Reference_ID=200061 */
	public static final int QUERYOPERATOR_AD_Reference_ID=200061;
	/** != = != */
	public static final String QUERYOPERATOR_NotEq = "!=";
	/** &lt; = &lt; */
	public static final String QUERYOPERATOR_Le = "<";
	/** &lt;= = &lt;= */
	public static final String QUERYOPERATOR_LeEq = "<=";
	/** = = = */
	public static final String QUERYOPERATOR_Eq = "=";
	/** &gt; = &gt; */
	public static final String QUERYOPERATOR_Gt = ">";
	/** &gt;= = &gt;= */
	public static final String QUERYOPERATOR_GtEq = ">=";
	/** Full Like = LIKE */
	public static final String QUERYOPERATOR_FullLike = "LIKE";
	/** Like = Like */
	public static final String QUERYOPERATOR_Like = "Like";
	/** Set Query Operator.
		@param QueryOperator Operator for database query
	*/
	public void setQueryOperator (String QueryOperator)
	{

		set_Value (COLUMNNAME_QueryOperator, QueryOperator);
	}

	/** Get Query Operator.
		@return Operator for database query
	  */
	public String getQueryOperator()
	{
		return (String)get_Value(COLUMNNAME_QueryOperator);
	}

	/** Set Sql SELECT.
		@param SelectClause SQL SELECT clause
	*/
	public void setSelectClause (String SelectClause)
	{
		set_Value (COLUMNNAME_SelectClause, SelectClause);
	}

	/** Get Sql SELECT.
		@return SQL SELECT clause
	  */
	public String getSelectClause()
	{
		return (String)get_Value(COLUMNNAME_SelectClause);
	}

	/** Set Sequence.
		@param SeqNo Method of ordering records; lowest number comes first
	*/
	public void setSeqNo (int SeqNo)
	{
		set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
	}

	/** Get Sequence.
		@return Method of ordering records; lowest number comes first
	  */
	public int getSeqNo()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Selection Column Sequence.
		@param SeqNoSelection Selection Column Sequence
	*/
	public void setSeqNoSelection (int SeqNoSelection)
	{
		set_Value (COLUMNNAME_SeqNoSelection, Integer.valueOf(SeqNoSelection));
	}

	/** Get Selection Column Sequence.
		@return Selection Column Sequence
	  */
	public int getSeqNoSelection()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_SeqNoSelection);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}