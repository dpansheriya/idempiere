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

/** Generated Model for AD_ReplicationDocument
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="AD_ReplicationDocument")
public class X_AD_ReplicationDocument extends PO implements I_AD_ReplicationDocument, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_AD_ReplicationDocument (Properties ctx, int AD_ReplicationDocument_ID, String trxName)
    {
      super (ctx, AD_ReplicationDocument_ID, trxName);
      /** if (AD_ReplicationDocument_ID == 0)
        {
			setAD_ReplicationDocument_ID (0);
			setAD_ReplicationStrategy_ID (0);
			setAD_Table_ID (0);
			setC_DocType_ID (0);
			setReplicationType (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_ReplicationDocument (Properties ctx, int AD_ReplicationDocument_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_ReplicationDocument_ID, trxName, virtualColumns);
      /** if (AD_ReplicationDocument_ID == 0)
        {
			setAD_ReplicationDocument_ID (0);
			setAD_ReplicationStrategy_ID (0);
			setAD_Table_ID (0);
			setC_DocType_ID (0);
			setReplicationType (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_ReplicationDocument (Properties ctx, String AD_ReplicationDocument_UU, String trxName)
    {
      super (ctx, AD_ReplicationDocument_UU, trxName);
      /** if (AD_ReplicationDocument_UU == null)
        {
			setAD_ReplicationDocument_ID (0);
			setAD_ReplicationStrategy_ID (0);
			setAD_Table_ID (0);
			setC_DocType_ID (0);
			setReplicationType (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_ReplicationDocument (Properties ctx, String AD_ReplicationDocument_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_ReplicationDocument_UU, trxName, virtualColumns);
      /** if (AD_ReplicationDocument_UU == null)
        {
			setAD_ReplicationDocument_ID (0);
			setAD_ReplicationStrategy_ID (0);
			setAD_Table_ID (0);
			setC_DocType_ID (0);
			setReplicationType (null);
        } */
    }

    /** Load Constructor */
    public X_AD_ReplicationDocument (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org
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
      StringBuilder sb = new StringBuilder ("X_AD_ReplicationDocument[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Replication Document.
		@param AD_ReplicationDocument_ID Replication Document
	*/
	public void setAD_ReplicationDocument_ID (int AD_ReplicationDocument_ID)
	{
		if (AD_ReplicationDocument_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_ReplicationDocument_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_ReplicationDocument_ID, Integer.valueOf(AD_ReplicationDocument_ID));
	}

	/** Get Replication Document.
		@return Replication Document	  */
	public int getAD_ReplicationDocument_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_ReplicationDocument_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AD_ReplicationDocument_UU.
		@param AD_ReplicationDocument_UU AD_ReplicationDocument_UU
	*/
	public void setAD_ReplicationDocument_UU (String AD_ReplicationDocument_UU)
	{
		set_Value (COLUMNNAME_AD_ReplicationDocument_UU, AD_ReplicationDocument_UU);
	}

	/** Get AD_ReplicationDocument_UU.
		@return AD_ReplicationDocument_UU	  */
	public String getAD_ReplicationDocument_UU()
	{
		return (String)get_Value(COLUMNNAME_AD_ReplicationDocument_UU);
	}

	/** Set Replication Strategy.
		@param AD_ReplicationStrategy_ID Data Replication Strategy
	*/
	public void setAD_ReplicationStrategy_ID (int AD_ReplicationStrategy_ID)
	{
		if (AD_ReplicationStrategy_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_ReplicationStrategy_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_ReplicationStrategy_ID, Integer.valueOf(AD_ReplicationStrategy_ID));
	}

	/** Get Replication Strategy.
		@return Data Replication Strategy
	  */
	public int getAD_ReplicationStrategy_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_ReplicationStrategy_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_Table getAD_Table() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Table)MTable.get(getCtx(), org.compiere.model.I_AD_Table.Table_ID)
			.getPO(getAD_Table_ID(), get_TrxName());
	}

	/** Set Table.
		@param AD_Table_ID Database Table information
	*/
	public void setAD_Table_ID (int AD_Table_ID)
	{
		if (AD_Table_ID < 1)
			set_Value (COLUMNNAME_AD_Table_ID, null);
		else
			set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
	}

	/** Get Table.
		@return Database Table information
	  */
	public int getAD_Table_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException
	{
		return (org.compiere.model.I_C_DocType)MTable.get(getCtx(), org.compiere.model.I_C_DocType.Table_ID)
			.getPO(getC_DocType_ID(), get_TrxName());
	}

	/** Set Document Type.
		@param C_DocType_ID Document type or rules
	*/
	public void setC_DocType_ID (int C_DocType_ID)
	{
		if (C_DocType_ID < 0)
			set_Value (COLUMNNAME_C_DocType_ID, null);
		else
			set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
	}

	/** Get Document Type.
		@return Document type or rules
	  */
	public int getC_DocType_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** ReplicationType AD_Reference_ID=126 */
	public static final int REPLICATIONTYPE_AD_Reference_ID=126;
	/** Broadcast = B */
	public static final String REPLICATIONTYPE_Broadcast = "B";
	/** Local = L */
	public static final String REPLICATIONTYPE_Local = "L";
	/** Merge = M */
	public static final String REPLICATIONTYPE_Merge = "M";
	/** Reference = R */
	public static final String REPLICATIONTYPE_Reference = "R";
	/** Set Replication Type.
		@param ReplicationType Type of Data Replication
	*/
	public void setReplicationType (String ReplicationType)
	{

		set_Value (COLUMNNAME_ReplicationType, ReplicationType);
	}

	/** Get Replication Type.
		@return Type of Data Replication
	  */
	public String getReplicationType()
	{
		return (String)get_Value(COLUMNNAME_ReplicationType);
	}
}