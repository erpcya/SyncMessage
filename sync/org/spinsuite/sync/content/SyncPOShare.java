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
 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com Mar 27, 2015, 8:53:55 PM
 *
 */
public class SyncPOShare extends SyncPO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2780759773825153210L;

	/**
	 * *** Constructor ***
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_LocalClient_ID
	 */
	public SyncPOShare(String p_LocalClient_ID) {
		super(p_LocalClient_ID);
	}

	/**
	 * *** Constructor ***
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_LocalClient_ID
	 * @param p_AD_Table_ID
	 * @param p_SyncType
	 * @param p_Detail
	 */
	public SyncPOShare(String p_LocalClient_ID, int p_AD_Table_ID,
			String p_SyncType, HashMap<String, Object> p_Detail) {
		super(p_LocalClient_ID, p_AD_Table_ID, p_SyncType, p_Detail);
	}
	
	/**	Share Type					*/
	public static final	String 		SYNC_TYPE_SHARE 	= "S";

}
