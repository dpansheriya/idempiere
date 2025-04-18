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

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.util.Env;

/** Generated Model for A_Asset_Product
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="A_Asset_Product")
public class X_A_Asset_Product extends PO implements I_A_Asset_Product, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_A_Asset_Product (Properties ctx, int A_Asset_Product_ID, String trxName)
    {
      super (ctx, A_Asset_Product_ID, trxName);
      /** if (A_Asset_Product_ID == 0)
        {
			setA_Asset_ID (0);
			setA_Asset_Product_ID (0);
			setA_QTY_Current (Env.ZERO);
// 0
			setM_AttributeSetInstance_ID (0);
			setM_Product_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_A_Asset_Product (Properties ctx, int A_Asset_Product_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, A_Asset_Product_ID, trxName, virtualColumns);
      /** if (A_Asset_Product_ID == 0)
        {
			setA_Asset_ID (0);
			setA_Asset_Product_ID (0);
			setA_QTY_Current (Env.ZERO);
// 0
			setM_AttributeSetInstance_ID (0);
			setM_Product_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_A_Asset_Product (Properties ctx, String A_Asset_Product_UU, String trxName)
    {
      super (ctx, A_Asset_Product_UU, trxName);
      /** if (A_Asset_Product_UU == null)
        {
			setA_Asset_ID (0);
			setA_Asset_Product_ID (0);
			setA_QTY_Current (Env.ZERO);
// 0
			setM_AttributeSetInstance_ID (0);
			setM_Product_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_A_Asset_Product (Properties ctx, String A_Asset_Product_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, A_Asset_Product_UU, trxName, virtualColumns);
      /** if (A_Asset_Product_UU == null)
        {
			setA_Asset_ID (0);
			setA_Asset_Product_ID (0);
			setA_QTY_Current (Env.ZERO);
// 0
			setM_AttributeSetInstance_ID (0);
			setM_Product_ID (0);
        } */
    }

    /** Load Constructor */
    public X_A_Asset_Product (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_A_Asset_Product[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_A_Asset getA_Asset() throws RuntimeException
	{
		return (org.compiere.model.I_A_Asset)MTable.get(getCtx(), org.compiere.model.I_A_Asset.Table_ID)
			.getPO(getA_Asset_ID(), get_TrxName());
	}

	/** Set Asset.
		@param A_Asset_ID Asset used internally or by customers
	*/
	public void setA_Asset_ID (int A_Asset_ID)
	{
		if (A_Asset_ID < 1)
			set_ValueNoCheck (COLUMNNAME_A_Asset_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
	}

	/** Get Asset.
		@return Asset used internally or by customers
	  */
	public int getA_Asset_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Asset Product.
		@param A_Asset_Product_ID Asset Product
	*/
	public void setA_Asset_Product_ID (int A_Asset_Product_ID)
	{
		if (A_Asset_Product_ID < 1)
			set_ValueNoCheck (COLUMNNAME_A_Asset_Product_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_A_Asset_Product_ID, Integer.valueOf(A_Asset_Product_ID));
	}

	/** Get Asset Product.
		@return Asset Product	  */
	public int getA_Asset_Product_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set A_Asset_Product_UU.
		@param A_Asset_Product_UU A_Asset_Product_UU
	*/
	public void setA_Asset_Product_UU (String A_Asset_Product_UU)
	{
		set_Value (COLUMNNAME_A_Asset_Product_UU, A_Asset_Product_UU);
	}

	/** Get A_Asset_Product_UU.
		@return A_Asset_Product_UU	  */
	public String getA_Asset_Product_UU()
	{
		return (String)get_Value(COLUMNNAME_A_Asset_Product_UU);
	}

	/** Set Current Qty.
		@param A_QTY_Current Current Qty
	*/
	public void setA_QTY_Current (BigDecimal A_QTY_Current)
	{
		set_Value (COLUMNNAME_A_QTY_Current, A_QTY_Current);
	}

	/** Get Current Qty.
		@return Current Qty	  */
	public BigDecimal getA_QTY_Current()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_A_QTY_Current);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	public I_M_AttributeSetInstance getM_AttributeSetInstance() throws RuntimeException
	{
		return (I_M_AttributeSetInstance)MTable.get(getCtx(), I_M_AttributeSetInstance.Table_ID)
			.getPO(getM_AttributeSetInstance_ID(), get_TrxName());
	}

	/** Set Attribute Set Instance.
		@param M_AttributeSetInstance_ID Product Attribute Set Instance
	*/
	public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
	{
		if (M_AttributeSetInstance_ID < 0)
			set_Value (COLUMNNAME_M_AttributeSetInstance_ID, null);
		else
			set_Value (COLUMNNAME_M_AttributeSetInstance_ID, Integer.valueOf(M_AttributeSetInstance_ID));
	}

	/** Get Attribute Set Instance.
		@return Product Attribute Set Instance
	  */
	public int getM_AttributeSetInstance_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetInstance_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_M_Locator getM_Locator() throws RuntimeException
	{
		return (I_M_Locator)MTable.get(getCtx(), I_M_Locator.Table_ID)
			.getPO(getM_Locator_ID(), get_TrxName());
	}

	/** Set Locator.
		@param M_Locator_ID Warehouse Locator
	*/
	public void setM_Locator_ID (int M_Locator_ID)
	{
		if (M_Locator_ID < 1)
			set_Value (COLUMNNAME_M_Locator_ID, null);
		else
			set_Value (COLUMNNAME_M_Locator_ID, Integer.valueOf(M_Locator_ID));
	}

	/** Get Locator.
		@return Warehouse Locator
	  */
	public int getM_Locator_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Locator_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException
	{
		return (org.compiere.model.I_M_Product)MTable.get(getCtx(), org.compiere.model.I_M_Product.Table_ID)
			.getPO(getM_Product_ID(), get_TrxName());
	}

	/** Set Product.
		@param M_Product_ID Product, Service, Item
	*/
	public void setM_Product_ID (int M_Product_ID)
	{
		if (M_Product_ID < 1)
			set_Value (COLUMNNAME_M_Product_ID, null);
		else
			set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
	}

	/** Get Product.
		@return Product, Service, Item
	  */
	public int getM_Product_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}