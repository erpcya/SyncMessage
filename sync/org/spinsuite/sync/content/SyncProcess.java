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
public class SyncProcess extends SyncPO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 90998070144630205L;

	/**
	 * *** Constructor ***
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_LocalClient_ID
	 */
	public SyncProcess(String p_LocalClient_ID) {
		super(p_LocalClient_ID);
	}
	
	/**
	 * Full Constructor
	 * *** Constructor ***
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_LocalClient_ID
	 * @param p_AD_Table_ID
	 * @param p_AD_Process_ID
	 * @param p_SyncType
	 * @param p_Detail
	 */
	public SyncProcess(String p_LocalClient_ID, int p_AD_Table_ID, int p_AD_Process_ID, 
			String p_SyncType, HashMap<String, Object> p_Detail) {
		super(p_LocalClient_ID, p_AD_Table_ID, p_SyncType, p_Detail);
		m_AD_Process_ID = p_AD_Process_ID;
	}
	
	/**	Table Identifier			*/
	private int 	m_AD_Process_ID = 0;
	
	/**
	 * Get Process
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return int
	 */
	public int getAD_Process_ID() {
		return m_AD_Process_ID;
	}
	
	/**
	 * Set Table
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_AD_Process_ID
	 * @return void
	 */
	public void setAD_Process_ID(int p_AD_Process_ID) {
		m_AD_Process_ID = p_AD_Process_ID;
	}

	@Override
	public String toString() {
		return "SyncProcess [m_AD_Process_ID=" + m_AD_Process_ID + "]";
	}
}
