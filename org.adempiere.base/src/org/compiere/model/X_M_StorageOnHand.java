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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.Env;

/** Generated Model for M_StorageOnHand
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="M_StorageOnHand")
public class X_M_StorageOnHand extends PO implements I_M_StorageOnHand, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_M_StorageOnHand (Properties ctx, int M_StorageOnHand_ID, String trxName)
    {
      super (ctx, M_StorageOnHand_ID, trxName);
      /** if (M_StorageOnHand_ID == 0)
        {
			setDateMaterialPolicy (new Timestamp( System.currentTimeMillis() ));
			setM_AttributeSetInstance_ID (0);
			setM_Locator_ID (0);
			setM_Product_ID (0);
			setQtyOnHand (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_M_StorageOnHand (Properties ctx, int M_StorageOnHand_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, M_StorageOnHand_ID, trxName, virtualColumns);
      /** if (M_StorageOnHand_ID == 0)
        {
			setDateMaterialPolicy (new Timestamp( System.currentTimeMillis() ));
			setM_AttributeSetInstance_ID (0);
			setM_Locator_ID (0);
			setM_Product_ID (0);
			setQtyOnHand (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_M_StorageOnHand (Properties ctx, String M_StorageOnHand_UU, String trxName)
    {
      super (ctx, M_StorageOnHand_UU, trxName);
      /** if (M_StorageOnHand_UU == null)
        {
			setDateMaterialPolicy (new Timestamp( System.currentTimeMillis() ));
			setM_AttributeSetInstance_ID (0);
			setM_Locator_ID (0);
			setM_Product_ID (0);
			setQtyOnHand (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_M_StorageOnHand (Properties ctx, String M_StorageOnHand_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, M_StorageOnHand_UU, trxName, virtualColumns);
      /** if (M_StorageOnHand_UU == null)
        {
			setDateMaterialPolicy (new Timestamp( System.currentTimeMillis() ));
			setM_AttributeSetInstance_ID (0);
			setM_Locator_ID (0);
			setM_Product_ID (0);
			setQtyOnHand (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_M_StorageOnHand (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_M_StorageOnHand[")
        .append(get_UUID()).append("]");
      return sb.toString();
    }

	/** Set Date Last Inventory Count.
		@param DateLastInventory Date of Last Inventory Count
	*/
	public void setDateLastInventory (Timestamp DateLastInventory)
	{
		set_Value (COLUMNNAME_DateLastInventory, DateLastInventory);
	}

	/** Get Date Last Inventory Count.
		@return Date of Last Inventory Count
	  */
	public Timestamp getDateLastInventory()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateLastInventory);
	}

	/** Set Date  Material Policy.
		@param DateMaterialPolicy Time used for LIFO and FIFO Material Policy
	*/
	public void setDateMaterialPolicy (Timestamp DateMaterialPolicy)
	{
		set_ValueNoCheck (COLUMNNAME_DateMaterialPolicy, DateMaterialPolicy);
	}

	/** Get Date  Material Policy.
		@return Time used for LIFO and FIFO Material Policy
	  */
	public Timestamp getDateMaterialPolicy()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateMaterialPolicy);
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
			set_ValueNoCheck (COLUMNNAME_M_AttributeSetInstance_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_AttributeSetInstance_ID, Integer.valueOf(M_AttributeSetInstance_ID));
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
			set_ValueNoCheck (COLUMNNAME_M_Locator_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_Locator_ID, Integer.valueOf(M_Locator_ID));
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
			set_ValueNoCheck (COLUMNNAME_M_Product_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
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

	/** Set M_StorageOnHand_UU.
		@param M_StorageOnHand_UU M_StorageOnHand_UU
	*/
	public void setM_StorageOnHand_UU (String M_StorageOnHand_UU)
	{
		set_Value (COLUMNNAME_M_StorageOnHand_UU, M_StorageOnHand_UU);
	}

	/** Get M_StorageOnHand_UU.
		@return M_StorageOnHand_UU	  */
	public String getM_StorageOnHand_UU()
	{
		return (String)get_Value(COLUMNNAME_M_StorageOnHand_UU);
	}

	/** Set On Hand Quantity.
		@param QtyOnHand On Hand Quantity
	*/
	public void setQtyOnHand (BigDecimal QtyOnHand)
	{
		set_ValueNoCheck (COLUMNNAME_QtyOnHand, QtyOnHand);
	}

	/** Get On Hand Quantity.
		@return On Hand Quantity
	  */
	public BigDecimal getQtyOnHand()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyOnHand);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}