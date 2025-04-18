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
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for AD_PInstance_Log
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
public interface I_AD_PInstance_Log 
{

    /** TableName=AD_PInstance_Log */
    public static final String Table_Name = "AD_PInstance_Log";

    /** AD_Table_ID=578 */
    public static final int Table_ID = 578;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 6 - System - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /** Column name AD_PInstance_ID */
    public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";

	/** Set Process Instance.
	  * Instance of the process
	  */
	public void setAD_PInstance_ID (int AD_PInstance_ID);

	/** Get Process Instance.
	  * Instance of the process
	  */
	public int getAD_PInstance_ID();

	public org.compiere.model.I_AD_PInstance getAD_PInstance() throws RuntimeException;

    /** Column name AD_PInstance_Log_UU */
    public static final String COLUMNNAME_AD_PInstance_Log_UU = "AD_PInstance_Log_UU";

	/** Set AD_PInstance_Log_UU	  */
	public void setAD_PInstance_Log_UU (String AD_PInstance_Log_UU);

	/** Get AD_PInstance_Log_UU	  */
	public String getAD_PInstance_Log_UU();

    /** Column name AD_Table_ID */
    public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

	/** Set Table.
	  * Database Table information
	  */
	public void setAD_Table_ID (int AD_Table_ID);

	/** Get Table.
	  * Database Table information
	  */
	public int getAD_Table_ID();

	public org.compiere.model.I_AD_Table getAD_Table() throws RuntimeException;

    /** Column name JsonData */
    public static final String COLUMNNAME_JsonData = "JsonData";

	/** Set JSON Data.
	  * The json field stores json data.
	  */
	public void setJsonData (String JsonData);

	/** Get JSON Data.
	  * The json field stores json data.
	  */
	public String getJsonData();

    /** Column name Log_ID */
    public static final String COLUMNNAME_Log_ID = "Log_ID";

	/** Set Log	  */
	public void setLog_ID (int Log_ID);

	/** Get Log	  */
	public int getLog_ID();

    /** Column name PInstanceLogType */
    public static final String COLUMNNAME_PInstanceLogType = "PInstanceLogType";

	/** Set Log Type.
	  * Process Audit Log Type
	  */
	public void setPInstanceLogType (String PInstanceLogType);

	/** Get Log Type.
	  * Process Audit Log Type
	  */
	public String getPInstanceLogType();

    /** Column name P_Date */
    public static final String COLUMNNAME_P_Date = "P_Date";

	/** Set Process Date.
	  * Process Parameter
	  */
	public void setP_Date (Timestamp P_Date);

	/** Get Process Date.
	  * Process Parameter
	  */
	public Timestamp getP_Date();

    /** Column name P_ID */
    public static final String COLUMNNAME_P_ID = "P_ID";

	/** Set Process ID	  */
	public void setP_ID (int P_ID);

	/** Get Process ID	  */
	public int getP_ID();

    /** Column name P_Msg */
    public static final String COLUMNNAME_P_Msg = "P_Msg";

	/** Set Process Message	  */
	public void setP_Msg (String P_Msg);

	/** Get Process Message	  */
	public String getP_Msg();

    /** Column name P_Number */
    public static final String COLUMNNAME_P_Number = "P_Number";

	/** Set Process Number.
	  * Process Parameter
	  */
	public void setP_Number (BigDecimal P_Number);

	/** Get Process Number.
	  * Process Parameter
	  */
	public BigDecimal getP_Number();

    /** Column name Record_ID */
    public static final String COLUMNNAME_Record_ID = "Record_ID";

	/** Set Record ID.
	  * Direct internal record ID
	  */
	public void setRecord_ID (int Record_ID);

	/** Get Record ID.
	  * Direct internal record ID
	  */
	public int getRecord_ID();
}
