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
import org.compiere.util.KeyNamePair;

/** Generated Model for C_BankAccount
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="C_BankAccount")
public class X_C_BankAccount extends PO implements I_C_BankAccount, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_C_BankAccount (Properties ctx, int C_BankAccount_ID, String trxName)
    {
      super (ctx, C_BankAccount_ID, trxName);
      /** if (C_BankAccount_ID == 0)
        {
			setAccountNo (null);
			setBankAccountType (null);
			setC_BankAccount_ID (0);
			setC_Bank_ID (0);
			setC_Currency_ID (0);
			setCreditLimit (Env.ZERO);
			setCurrentBalance (Env.ZERO);
			setIsDefault (false);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_C_BankAccount (Properties ctx, int C_BankAccount_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, C_BankAccount_ID, trxName, virtualColumns);
      /** if (C_BankAccount_ID == 0)
        {
			setAccountNo (null);
			setBankAccountType (null);
			setC_BankAccount_ID (0);
			setC_Bank_ID (0);
			setC_Currency_ID (0);
			setCreditLimit (Env.ZERO);
			setCurrentBalance (Env.ZERO);
			setIsDefault (false);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_C_BankAccount (Properties ctx, String C_BankAccount_UU, String trxName)
    {
      super (ctx, C_BankAccount_UU, trxName);
      /** if (C_BankAccount_UU == null)
        {
			setAccountNo (null);
			setBankAccountType (null);
			setC_BankAccount_ID (0);
			setC_Bank_ID (0);
			setC_Currency_ID (0);
			setCreditLimit (Env.ZERO);
			setCurrentBalance (Env.ZERO);
			setIsDefault (false);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_C_BankAccount (Properties ctx, String C_BankAccount_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, C_BankAccount_UU, trxName, virtualColumns);
      /** if (C_BankAccount_UU == null)
        {
			setAccountNo (null);
			setBankAccountType (null);
			setC_BankAccount_ID (0);
			setC_Bank_ID (0);
			setC_Currency_ID (0);
			setCreditLimit (Env.ZERO);
			setCurrentBalance (Env.ZERO);
			setIsDefault (false);
			setName (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_C_BankAccount (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_C_BankAccount[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Account No.
		@param AccountNo Account Number
	*/
	public void setAccountNo (String AccountNo)
	{
		set_Value (COLUMNNAME_AccountNo, AccountNo);
	}

	/** Get Account No.
		@return Account Number
	  */
	public String getAccountNo()
	{
		return (String)get_Value(COLUMNNAME_AccountNo);
	}

	/** Set BBAN.
		@param BBAN Basic Bank Account Number
	*/
	public void setBBAN (String BBAN)
	{
		set_Value (COLUMNNAME_BBAN, BBAN);
	}

	/** Get BBAN.
		@return Basic Bank Account Number
	  */
	public String getBBAN()
	{
		return (String)get_Value(COLUMNNAME_BBAN);
	}

	/** BankAccountType AD_Reference_ID=216 */
	public static final int BANKACCOUNTTYPE_AD_Reference_ID=216;
	/** Cash = B */
	public static final String BANKACCOUNTTYPE_Cash = "B";
	/** Checking = C */
	public static final String BANKACCOUNTTYPE_Checking = "C";
	/** Card = D */
	public static final String BANKACCOUNTTYPE_Card = "D";
	/** Savings = S */
	public static final String BANKACCOUNTTYPE_Savings = "S";
	/** Set Bank Account Type.
		@param BankAccountType Bank Account Type
	*/
	public void setBankAccountType (String BankAccountType)
	{

		set_Value (COLUMNNAME_BankAccountType, BankAccountType);
	}

	/** Get Bank Account Type.
		@return Bank Account Type
	  */
	public String getBankAccountType()
	{
		return (String)get_Value(COLUMNNAME_BankAccountType);
	}

	/** Set Bank Account.
		@param C_BankAccount_ID Account at the Bank
	*/
	public void setC_BankAccount_ID (int C_BankAccount_ID)
	{
		if (C_BankAccount_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_BankAccount_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_BankAccount_ID, Integer.valueOf(C_BankAccount_ID));
	}

	/** Get Bank Account.
		@return Account at the Bank
	  */
	public int getC_BankAccount_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BankAccount_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_BankAccount_UU.
		@param C_BankAccount_UU C_BankAccount_UU
	*/
	public void setC_BankAccount_UU (String C_BankAccount_UU)
	{
		set_Value (COLUMNNAME_C_BankAccount_UU, C_BankAccount_UU);
	}

	/** Get C_BankAccount_UU.
		@return C_BankAccount_UU	  */
	public String getC_BankAccount_UU()
	{
		return (String)get_Value(COLUMNNAME_C_BankAccount_UU);
	}

	public org.compiere.model.I_C_Bank getC_Bank() throws RuntimeException
	{
		return (org.compiere.model.I_C_Bank)MTable.get(getCtx(), org.compiere.model.I_C_Bank.Table_ID)
			.getPO(getC_Bank_ID(), get_TrxName());
	}

	/** Set Bank.
		@param C_Bank_ID Bank
	*/
	public void setC_Bank_ID (int C_Bank_ID)
	{
		if (C_Bank_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Bank_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Bank_ID, Integer.valueOf(C_Bank_ID));
	}

	/** Get Bank.
		@return Bank
	  */
	public int getC_Bank_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Bank_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException
	{
		return (org.compiere.model.I_C_Currency)MTable.get(getCtx(), org.compiere.model.I_C_Currency.Table_ID)
			.getPO(getC_Currency_ID(), get_TrxName());
	}

	/** Set Currency.
		@param C_Currency_ID The Currency for this record
	*/
	public void setC_Currency_ID (int C_Currency_ID)
	{
		if (C_Currency_ID < 1)
			set_Value (COLUMNNAME_C_Currency_ID, null);
		else
			set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
	}

	/** Get Currency.
		@return The Currency for this record
	  */
	public int getC_Currency_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Credit limit.
		@param CreditLimit Amount of Credit allowed
	*/
	public void setCreditLimit (BigDecimal CreditLimit)
	{
		set_Value (COLUMNNAME_CreditLimit, CreditLimit);
	}

	/** Get Credit limit.
		@return Amount of Credit allowed
	  */
	public BigDecimal getCreditLimit()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CreditLimit);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Current balance.
		@param CurrentBalance Current Balance
	*/
	public void setCurrentBalance (BigDecimal CurrentBalance)
	{
		set_Value (COLUMNNAME_CurrentBalance, CurrentBalance);
	}

	/** Get Current balance.
		@return Current Balance
	  */
	public BigDecimal getCurrentBalance()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CurrentBalance);
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

	/** Set IBAN.
		@param IBAN International Bank Account Number
	*/
	public void setIBAN (String IBAN)
	{
		set_Value (COLUMNNAME_IBAN, IBAN);
	}

	/** Get IBAN.
		@return International Bank Account Number
	  */
	public String getIBAN()
	{
		return (String)get_Value(COLUMNNAME_IBAN);
	}

	/** Set Default.
		@param IsDefault Default value
	*/
	public void setIsDefault (boolean IsDefault)
	{
		set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
	}

	/** Get Default.
		@return Default value
	  */
	public boolean isDefault()
	{
		Object oo = get_Value(COLUMNNAME_IsDefault);
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

	/** Set Payment Export Class.
		@param PaymentExportClass Payment Export Class
	*/
	public void setPaymentExportClass (String PaymentExportClass)
	{
		set_Value (COLUMNNAME_PaymentExportClass, PaymentExportClass);
	}

	/** Get Payment Export Class.
		@return Payment Export Class	  */
	public String getPaymentExportClass()
	{
		return (String)get_Value(COLUMNNAME_PaymentExportClass);
	}

	/** Set Search Key.
		@param Value Search key for the record in the format required - must be unique
	*/
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue()
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}