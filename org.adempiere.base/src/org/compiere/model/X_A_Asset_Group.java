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

/** Generated Model for A_Asset_Group
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="A_Asset_Group")
public class X_A_Asset_Group extends PO implements I_A_Asset_Group, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_A_Asset_Group (Properties ctx, int A_Asset_Group_ID, String trxName)
    {
      super (ctx, A_Asset_Group_ID, trxName);
      /** if (A_Asset_Group_ID == 0)
        {
			setA_Asset_Group_ID (0);
			setIsCreateAsActive (true);
// Y
			setIsDefault (false);
// 'N'
			setIsDepreciated (false);
			setIsOneAssetPerUOM (false);
			setIsOwned (false);
			setIsTrackIssues (false);
// N
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_A_Asset_Group (Properties ctx, int A_Asset_Group_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, A_Asset_Group_ID, trxName, virtualColumns);
      /** if (A_Asset_Group_ID == 0)
        {
			setA_Asset_Group_ID (0);
			setIsCreateAsActive (true);
// Y
			setIsDefault (false);
// 'N'
			setIsDepreciated (false);
			setIsOneAssetPerUOM (false);
			setIsOwned (false);
			setIsTrackIssues (false);
// N
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_A_Asset_Group (Properties ctx, String A_Asset_Group_UU, String trxName)
    {
      super (ctx, A_Asset_Group_UU, trxName);
      /** if (A_Asset_Group_UU == null)
        {
			setA_Asset_Group_ID (0);
			setIsCreateAsActive (true);
// Y
			setIsDefault (false);
// 'N'
			setIsDepreciated (false);
			setIsOneAssetPerUOM (false);
			setIsOwned (false);
			setIsTrackIssues (false);
// N
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_A_Asset_Group (Properties ctx, String A_Asset_Group_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, A_Asset_Group_UU, trxName, virtualColumns);
      /** if (A_Asset_Group_UU == null)
        {
			setA_Asset_Group_ID (0);
			setIsCreateAsActive (true);
// Y
			setIsDefault (false);
// 'N'
			setIsDepreciated (false);
			setIsOneAssetPerUOM (false);
			setIsOwned (false);
			setIsTrackIssues (false);
// N
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_A_Asset_Group (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_A_Asset_Group[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_A_Asset_Class getA_Asset_Class() throws RuntimeException
	{
		return (org.compiere.model.I_A_Asset_Class)MTable.get(getCtx(), org.compiere.model.I_A_Asset_Class.Table_ID)
			.getPO(getA_Asset_Class_ID(), get_TrxName());
	}

	/** Set Asset class.
		@param A_Asset_Class_ID Asset class
	*/
	public void setA_Asset_Class_ID (int A_Asset_Class_ID)
	{
		if (A_Asset_Class_ID < 1)
			set_Value (COLUMNNAME_A_Asset_Class_ID, null);
		else
			set_Value (COLUMNNAME_A_Asset_Class_ID, Integer.valueOf(A_Asset_Class_ID));
	}

	/** Get Asset class.
		@return Asset class	  */
	public int getA_Asset_Class_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Class_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Asset Group.
		@param A_Asset_Group_ID Group of Assets
	*/
	public void setA_Asset_Group_ID (int A_Asset_Group_ID)
	{
		if (A_Asset_Group_ID < 1)
			set_ValueNoCheck (COLUMNNAME_A_Asset_Group_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_A_Asset_Group_ID, Integer.valueOf(A_Asset_Group_ID));
	}

	/** Get Asset Group.
		@return Group of Assets
	  */
	public int getA_Asset_Group_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Group_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), String.valueOf(getA_Asset_Group_ID()));
    }

	/** Set A_Asset_Group_UU.
		@param A_Asset_Group_UU A_Asset_Group_UU
	*/
	public void setA_Asset_Group_UU (String A_Asset_Group_UU)
	{
		set_Value (COLUMNNAME_A_Asset_Group_UU, A_Asset_Group_UU);
	}

	/** Get A_Asset_Group_UU.
		@return A_Asset_Group_UU	  */
	public String getA_Asset_Group_UU()
	{
		return (String)get_Value(COLUMNNAME_A_Asset_Group_UU);
	}

	public org.compiere.model.I_A_Asset_Type getA_Asset_Type() throws RuntimeException
	{
		return (org.compiere.model.I_A_Asset_Type)MTable.get(getCtx(), org.compiere.model.I_A_Asset_Type.Table_ID)
			.getPO(getA_Asset_Type_ID(), get_TrxName());
	}

	/** Set Asset Type.
		@param A_Asset_Type_ID Asset Type
	*/
	public void setA_Asset_Type_ID (int A_Asset_Type_ID)
	{
		if (A_Asset_Type_ID < 1)
			set_Value (COLUMNNAME_A_Asset_Type_ID, null);
		else
			set_Value (COLUMNNAME_A_Asset_Type_ID, Integer.valueOf(A_Asset_Type_ID));
	}

	/** Get Asset Type.
		@return Asset Type	  */
	public int getA_Asset_Type_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Type_ID);
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

	/** Set Create As Active.
		@param IsCreateAsActive Create Asset and activate it
	*/
	public void setIsCreateAsActive (boolean IsCreateAsActive)
	{
		set_Value (COLUMNNAME_IsCreateAsActive, Boolean.valueOf(IsCreateAsActive));
	}

	/** Get Create As Active.
		@return Create Asset and activate it
	  */
	public boolean isCreateAsActive()
	{
		Object oo = get_Value(COLUMNNAME_IsCreateAsActive);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
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

	/** Set Depreciate.
		@param IsDepreciated The asset will be depreciated
	*/
	public void setIsDepreciated (boolean IsDepreciated)
	{
		set_Value (COLUMNNAME_IsDepreciated, Boolean.valueOf(IsDepreciated));
	}

	/** Get Depreciate.
		@return The asset will be depreciated
	  */
	public boolean isDepreciated()
	{
		Object oo = get_Value(COLUMNNAME_IsDepreciated);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Is Fixed Asset.
		@param IsFixedAsset Is Fixed Asset
	*/
	public void setIsFixedAsset (boolean IsFixedAsset)
	{
		set_Value (COLUMNNAME_IsFixedAsset, Boolean.valueOf(IsFixedAsset));
	}

	/** Get Is Fixed Asset.
		@return Is Fixed Asset	  */
	public boolean isFixedAsset()
	{
		Object oo = get_Value(COLUMNNAME_IsFixedAsset);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set One Asset Per UOM.
		@param IsOneAssetPerUOM Create one asset per UOM
	*/
	public void setIsOneAssetPerUOM (boolean IsOneAssetPerUOM)
	{
		set_Value (COLUMNNAME_IsOneAssetPerUOM, Boolean.valueOf(IsOneAssetPerUOM));
	}

	/** Get One Asset Per UOM.
		@return Create one asset per UOM
	  */
	public boolean isOneAssetPerUOM()
	{
		Object oo = get_Value(COLUMNNAME_IsOneAssetPerUOM);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Owned.
		@param IsOwned The asset is owned by the organization
	*/
	public void setIsOwned (boolean IsOwned)
	{
		set_Value (COLUMNNAME_IsOwned, Boolean.valueOf(IsOwned));
	}

	/** Get Owned.
		@return The asset is owned by the organization
	  */
	public boolean isOwned()
	{
		Object oo = get_Value(COLUMNNAME_IsOwned);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Track Issues.
		@param IsTrackIssues Enable tracking issues for this asset
	*/
	public void setIsTrackIssues (boolean IsTrackIssues)
	{
		set_Value (COLUMNNAME_IsTrackIssues, Boolean.valueOf(IsTrackIssues));
	}

	/** Get Track Issues.
		@return Enable tracking issues for this asset
	  */
	public boolean isTrackIssues()
	{
		Object oo = get_Value(COLUMNNAME_IsTrackIssues);
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
}