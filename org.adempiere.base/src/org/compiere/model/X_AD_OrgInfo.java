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

/** Generated Model for AD_OrgInfo
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="AD_OrgInfo")
public class X_AD_OrgInfo extends PO implements I_AD_OrgInfo, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_AD_OrgInfo (Properties ctx, int AD_OrgInfo_ID, String trxName)
    {
      super (ctx, AD_OrgInfo_ID, trxName);
      /** if (AD_OrgInfo_ID == 0)
        {
			setDUNS (null);
			setReceiptFooterMsg (null);
// 1
			setTaxID (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_OrgInfo (Properties ctx, int AD_OrgInfo_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_OrgInfo_ID, trxName, virtualColumns);
      /** if (AD_OrgInfo_ID == 0)
        {
			setDUNS (null);
			setReceiptFooterMsg (null);
// 1
			setTaxID (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_OrgInfo (Properties ctx, String AD_OrgInfo_UU, String trxName)
    {
      super (ctx, AD_OrgInfo_UU, trxName);
      /** if (AD_OrgInfo_UU == null)
        {
			setDUNS (null);
			setReceiptFooterMsg (null);
// 1
			setTaxID (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_OrgInfo (Properties ctx, String AD_OrgInfo_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_OrgInfo_UU, trxName, virtualColumns);
      /** if (AD_OrgInfo_UU == null)
        {
			setDUNS (null);
			setReceiptFooterMsg (null);
// 1
			setTaxID (null);
        } */
    }

    /** Load Constructor */
    public X_AD_OrgInfo (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org
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
      StringBuilder sb = new StringBuilder ("X_AD_OrgInfo[")
        .append(get_UUID()).append("]");
      return sb.toString();
    }

	/** Set AD_OrgInfo_UU.
		@param AD_OrgInfo_UU AD_OrgInfo_UU
	*/
	public void setAD_OrgInfo_UU (String AD_OrgInfo_UU)
	{
		set_Value (COLUMNNAME_AD_OrgInfo_UU, AD_OrgInfo_UU);
	}

	/** Get AD_OrgInfo_UU.
		@return AD_OrgInfo_UU	  */
	public String getAD_OrgInfo_UU()
	{
		return (String)get_Value(COLUMNNAME_AD_OrgInfo_UU);
	}

	public org.compiere.model.I_AD_OrgType getAD_OrgType() throws RuntimeException
	{
		return (org.compiere.model.I_AD_OrgType)MTable.get(getCtx(), org.compiere.model.I_AD_OrgType.Table_ID)
			.getPO(getAD_OrgType_ID(), get_TrxName());
	}

	/** Set Organization Type.
		@param AD_OrgType_ID Organization Type
	*/
	public void setAD_OrgType_ID (int AD_OrgType_ID)
	{
		if (AD_OrgType_ID < 1)
			set_Value (COLUMNNAME_AD_OrgType_ID, null);
		else
			set_Value (COLUMNNAME_AD_OrgType_ID, Integer.valueOf(AD_OrgType_ID));
	}

	/** Get Organization Type.
		@return Organization Type
	  */
	public int getAD_OrgType_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Calendar getC_Calendar() throws RuntimeException
	{
		return (org.compiere.model.I_C_Calendar)MTable.get(getCtx(), org.compiere.model.I_C_Calendar.Table_ID)
			.getPO(getC_Calendar_ID(), get_TrxName());
	}

	/** Set Calendar.
		@param C_Calendar_ID Accounting Calendar Name
	*/
	public void setC_Calendar_ID (int C_Calendar_ID)
	{
		if (C_Calendar_ID < 1)
			set_Value (COLUMNNAME_C_Calendar_ID, null);
		else
			set_Value (COLUMNNAME_C_Calendar_ID, Integer.valueOf(C_Calendar_ID));
	}

	/** Get Calendar.
		@return Accounting Calendar Name
	  */
	public int getC_Calendar_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Calendar_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_Location getC_Location() throws RuntimeException
	{
		return (I_C_Location)MTable.get(getCtx(), I_C_Location.Table_ID)
			.getPO(getC_Location_ID(), get_TrxName());
	}

	/** Set Address.
		@param C_Location_ID Location or Address
	*/
	public void setC_Location_ID (int C_Location_ID)
	{
		if (C_Location_ID < 1)
			set_Value (COLUMNNAME_C_Location_ID, null);
		else
			set_Value (COLUMNNAME_C_Location_ID, Integer.valueOf(C_Location_ID));
	}

	/** Get Address.
		@return Location or Address
	  */
	public int getC_Location_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Location_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set D-U-N-S.
		@param DUNS Dun &amp; Bradstreet Number
	*/
	public void setDUNS (String DUNS)
	{
		set_Value (COLUMNNAME_DUNS, DUNS);
	}

	/** Get D-U-N-S.
		@return Dun &amp; Bradstreet Number
	  */
	public String getDUNS()
	{
		return (String)get_Value(COLUMNNAME_DUNS);
	}

	public org.compiere.model.I_M_Warehouse getDropShip_Warehouse() throws RuntimeException
	{
		return (org.compiere.model.I_M_Warehouse)MTable.get(getCtx(), org.compiere.model.I_M_Warehouse.Table_ID)
			.getPO(getDropShip_Warehouse_ID(), get_TrxName());
	}

	/** Set Drop Ship Warehouse.
		@param DropShip_Warehouse_ID The (logical) warehouse to use for recording drop ship receipts and shipments.
	*/
	public void setDropShip_Warehouse_ID (int DropShip_Warehouse_ID)
	{
		if (DropShip_Warehouse_ID < 1)
			set_Value (COLUMNNAME_DropShip_Warehouse_ID, null);
		else
			set_Value (COLUMNNAME_DropShip_Warehouse_ID, Integer.valueOf(DropShip_Warehouse_ID));
	}

	/** Get Drop Ship Warehouse.
		@return The (logical) warehouse to use for recording drop ship receipts and shipments.
	  */
	public int getDropShip_Warehouse_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_DropShip_Warehouse_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set EMail Address.
		@param EMail Electronic Mail Address
	*/
	public void setEMail (String EMail)
	{
		set_Value (COLUMNNAME_EMail, EMail);
	}

	/** Get EMail Address.
		@return Electronic Mail Address
	  */
	public String getEMail()
	{
		return (String)get_Value(COLUMNNAME_EMail);
	}

	/** Set Fax.
		@param Fax Facsimile number
	*/
	public void setFax (String Fax)
	{
		set_Value (COLUMNNAME_Fax, Fax);
	}

	/** Get Fax.
		@return Facsimile number
	  */
	public String getFax()
	{
		return (String)get_Value(COLUMNNAME_Fax);
	}

	/** Set Logo.
		@param Logo_ID Logo
	*/
	public void setLogo_ID (int Logo_ID)
	{
		if (Logo_ID < 1)
			set_Value (COLUMNNAME_Logo_ID, null);
		else
			set_Value (COLUMNNAME_Logo_ID, Integer.valueOf(Logo_ID));
	}

	/** Get Logo.
		@return Logo	  */
	public int getLogo_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Logo_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_M_Warehouse getM_Warehouse() throws RuntimeException
	{
		return (org.compiere.model.I_M_Warehouse)MTable.get(getCtx(), org.compiere.model.I_M_Warehouse.Table_ID)
			.getPO(getM_Warehouse_ID(), get_TrxName());
	}

	/** Set Warehouse.
		@param M_Warehouse_ID Storage Warehouse and Service Point
	*/
	public void setM_Warehouse_ID (int M_Warehouse_ID)
	{
		if (M_Warehouse_ID < 1)
			set_Value (COLUMNNAME_M_Warehouse_ID, null);
		else
			set_Value (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
	}

	/** Get Warehouse.
		@return Storage Warehouse and Service Point
	  */
	public int getM_Warehouse_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Parent Organization.
		@param Parent_Org_ID Parent (superior) Organization 
	*/
	public void setParent_Org_ID (int Parent_Org_ID)
	{
		if (Parent_Org_ID < 1)
			set_Value (COLUMNNAME_Parent_Org_ID, null);
		else
			set_Value (COLUMNNAME_Parent_Org_ID, Integer.valueOf(Parent_Org_ID));
	}

	/** Get Parent Organization.
		@return Parent (superior) Organization 
	  */
	public int getParent_Org_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Parent_Org_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Phone.
		@param Phone Identifies a telephone number
	*/
	public void setPhone (String Phone)
	{
		set_Value (COLUMNNAME_Phone, Phone);
	}

	/** Get Phone.
		@return Identifies a telephone number
	  */
	public String getPhone()
	{
		return (String)get_Value(COLUMNNAME_Phone);
	}

	/** Set 2nd Phone.
		@param Phone2 Identifies an alternate telephone number.
	*/
	public void setPhone2 (String Phone2)
	{
		set_Value (COLUMNNAME_Phone2, Phone2);
	}

	/** Get 2nd Phone.
		@return Identifies an alternate telephone number.
	  */
	public String getPhone2()
	{
		return (String)get_Value(COLUMNNAME_Phone2);
	}

	/** Set Receipt Footer Msg.
		@param ReceiptFooterMsg This message will be displayed at the bottom of a receipt when doing a sales or purchase
	*/
	public void setReceiptFooterMsg (String ReceiptFooterMsg)
	{
		set_Value (COLUMNNAME_ReceiptFooterMsg, ReceiptFooterMsg);
	}

	/** Get Receipt Footer Msg.
		@return This message will be displayed at the bottom of a receipt when doing a sales or purchase
	  */
	public String getReceiptFooterMsg()
	{
		return (String)get_Value(COLUMNNAME_ReceiptFooterMsg);
	}

	public org.compiere.model.I_AD_User getSupervisor() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getSupervisor_ID(), get_TrxName());
	}

	/** Set Supervisor.
		@param Supervisor_ID Supervisor for this user/organization - used for escalation and approval
	*/
	public void setSupervisor_ID (int Supervisor_ID)
	{
		if (Supervisor_ID < 1)
			set_Value (COLUMNNAME_Supervisor_ID, null);
		else
			set_Value (COLUMNNAME_Supervisor_ID, Integer.valueOf(Supervisor_ID));
	}

	/** Get Supervisor.
		@return Supervisor for this user/organization - used for escalation and approval
	  */
	public int getSupervisor_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Supervisor_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Tax ID.
		@param TaxID Tax Identification
	*/
	public void setTaxID (String TaxID)
	{
		set_Value (COLUMNNAME_TaxID, TaxID);
	}

	/** Get Tax ID.
		@return Tax Identification
	  */
	public String getTaxID()
	{
		return (String)get_Value(COLUMNNAME_TaxID);
	}

	/** Set Time Zone.
		@param TimeZone Time zone name
	*/
	public void setTimeZone (String TimeZone)
	{
		set_Value (COLUMNNAME_TimeZone, TimeZone);
	}

	/** Get Time Zone.
		@return Time zone name
	  */
	public String getTimeZone()
	{
		return (String)get_Value(COLUMNNAME_TimeZone);
	}

	public org.compiere.model.I_C_Bank getTransferBank() throws RuntimeException
	{
		return (org.compiere.model.I_C_Bank)MTable.get(getCtx(), org.compiere.model.I_C_Bank.Table_ID)
			.getPO(getTransferBank_ID(), get_TrxName());
	}

	/** Set Bank for transfers.
		@param TransferBank_ID Bank account depending on currency will be used from this bank for doing transfers
	*/
	public void setTransferBank_ID (int TransferBank_ID)
	{
		if (TransferBank_ID < 1)
			set_Value (COLUMNNAME_TransferBank_ID, null);
		else
			set_Value (COLUMNNAME_TransferBank_ID, Integer.valueOf(TransferBank_ID));
	}

	/** Get Bank for transfers.
		@return Bank account depending on currency will be used from this bank for doing transfers
	  */
	public int getTransferBank_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TransferBank_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_CashBook getTransferCashBook() throws RuntimeException
	{
		return (org.compiere.model.I_C_CashBook)MTable.get(getCtx(), org.compiere.model.I_C_CashBook.Table_ID)
			.getPO(getTransferCashBook_ID(), get_TrxName());
	}

	/** Set CashBook for transfers.
		@param TransferCashBook_ID CashBook for transfers
	*/
	public void setTransferCashBook_ID (int TransferCashBook_ID)
	{
		if (TransferCashBook_ID < 1)
			set_Value (COLUMNNAME_TransferCashBook_ID, null);
		else
			set_Value (COLUMNNAME_TransferCashBook_ID, Integer.valueOf(TransferCashBook_ID));
	}

	/** Get CashBook for transfers.
		@return CashBook for transfers	  */
	public int getTransferCashBook_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TransferCashBook_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}