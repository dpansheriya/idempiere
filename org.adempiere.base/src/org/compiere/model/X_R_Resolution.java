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

/** Generated Model for R_Resolution
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="R_Resolution")
public class X_R_Resolution extends PO implements I_R_Resolution, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_R_Resolution (Properties ctx, int R_Resolution_ID, String trxName)
    {
      super (ctx, R_Resolution_ID, trxName);
      /** if (R_Resolution_ID == 0)
        {
			setName (null);
			setR_Resolution_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_R_Resolution (Properties ctx, int R_Resolution_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, R_Resolution_ID, trxName, virtualColumns);
      /** if (R_Resolution_ID == 0)
        {
			setName (null);
			setR_Resolution_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_R_Resolution (Properties ctx, String R_Resolution_UU, String trxName)
    {
      super (ctx, R_Resolution_UU, trxName);
      /** if (R_Resolution_UU == null)
        {
			setName (null);
			setR_Resolution_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_R_Resolution (Properties ctx, String R_Resolution_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, R_Resolution_UU, trxName, virtualColumns);
      /** if (R_Resolution_UU == null)
        {
			setName (null);
			setR_Resolution_ID (0);
        } */
    }

    /** Load Constructor */
    public X_R_Resolution (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 6 - System - Client
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
      StringBuilder sb = new StringBuilder ("X_R_Resolution[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
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

	/** Set Resolution.
		@param R_Resolution_ID Request Resolution
	*/
	public void setR_Resolution_ID (int R_Resolution_ID)
	{
		if (R_Resolution_ID < 1)
			set_ValueNoCheck (COLUMNNAME_R_Resolution_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_R_Resolution_ID, Integer.valueOf(R_Resolution_ID));
	}

	/** Get Resolution.
		@return Request Resolution
	  */
	public int getR_Resolution_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_R_Resolution_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set R_Resolution_UU.
		@param R_Resolution_UU R_Resolution_UU
	*/
	public void setR_Resolution_UU (String R_Resolution_UU)
	{
		set_Value (COLUMNNAME_R_Resolution_UU, R_Resolution_UU);
	}

	/** Get R_Resolution_UU.
		@return R_Resolution_UU	  */
	public String getR_Resolution_UU()
	{
		return (String)get_Value(COLUMNNAME_R_Resolution_UU);
	}
}