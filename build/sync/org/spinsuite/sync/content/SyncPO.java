/*************************************************************************************
 * Product: Spin-Suite (Making your Business Spin)                                   *
 * This program is free software; you can redistribute it and/or modify it           *
 * under the terms version 2 of the GNU General Public License as published          *
 * by the Free Software Foundation. This program is distributed in the hope          *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied        *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.                  *
 * See the GNU General Public License for more details.                              *
 * You should have received a copy of the GNU General Public License along           *
 * with this program; if not, write to the Free Software Foundation, Inc.,           *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                            *
 * For the text or an alternative of this public license, you may reach us           *
 * Copyright (C) 2012-2015 E.R.P. Consultores y Asociados, S.A. All Rights Reserved. *
 * Contributor(s): Yamel Senih www.erpcya.com                                        *
 *************************************************************************************/
package org.spinsuite.sync.content;

import java.util.HashMap;

/**
 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com Mar 27, 2015, 1:46:38 PM
 *
 */
public class SyncPO extends SyncParent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7850015954985904271L;

	/**
	 * *** Constructor ***
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_LocalClient_ID
	 */
	public SyncPO(String p_LocalClient_ID) {
		super(p_LocalClient_ID);
	}
	
	/**
	 * Full Constructor
	 * *** Constructor ***
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_LocalClient_ID
	 * @param p_AD_Table_ID
	 * @param p_SyncType
	 * @param p_Detail
	 */
	public SyncPO(String p_LocalClient_ID, int p_AD_Table_ID, 
			String p_SyncType, HashMap<String, Object> p_Detail) {
		super(p_LocalClient_ID);
		m_AD_Table_ID = p_AD_Table_ID;
		m_SyncType = p_SyncType;
		m_Detail = p_Detail;
	}
	
	/**	Table Identifier			*/
	private int 					m_AD_Table_ID 		= 0;
	/**	Synchronization Type		*/
	private String 					m_SyncType			= null;
	/**	Detail						*/
	private HashMap<String, Object> m_Detail			= null;
	/**	New Type					*/
	public static final	String 		SYNC_TYPE_NEW 		= "N";
	/**	Update Type					*/
	public static final	String 		SYNC_TYPE_UPDATE 	= "U";
	/**	Delete Type					*/
	public static final	String 		SYNC_TYPE_DELETE 	= "D";
	/**	Read Type					*/
	public static final	String 		SYNC_TYPE_READ 		= "R";
	
	/**
	 * Get Table
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return int
	 */
	public int getAD_Table_ID() {
		return m_AD_Table_ID;
	}
	
	/**
	 * Set Table
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_AD_Table_ID
	 * @return void
	 */
	public void setAD_Table_ID(int p_AD_Table_ID) {
		m_AD_Table_ID = p_AD_Table_ID;
	}
	
	/**
	 * Get Synchronization Type
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return String
	 */
	public String getSyncType() {
		return m_SyncType;
	}
	
	/**
	 * Set Synchronization Type
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_SyncType
	 * @return void
	 */
	public void setSyncType(String p_SyncType) {
		m_SyncType = p_SyncType;
	}
	
	/**
	 * Get Persistence Object Detail
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return HashMap<String,Object>
	 */
	public HashMap<String, Object> getDetail() {
		return m_Detail;
	}
	
	/**
	 * Set Persistence Object Detail
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_Detail
	 * @return void
	 */
	public void setDetail(HashMap<String, Object> p_Detail) {
		m_Detail = p_Detail;
	}
	
}
