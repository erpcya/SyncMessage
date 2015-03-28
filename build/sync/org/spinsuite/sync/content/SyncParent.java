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

import java.io.Serializable;

/**
 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com Mar 26, 2015, 7:21:45 PM
 *
 */
public abstract class SyncParent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 302061383366809965L;

	/**
	 * 
	 * *** Constructor ***
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_LocalClient_ID
	 */
	public SyncParent(String p_LocalClient_ID) {
		m_LocalClient_ID = p_LocalClient_ID;
	}
	
	/**	Client Identifier		*/
	private String 	m_LocalClient_ID = null;
	
	/**
	 * Get Local Client Identifier
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return String
	 */
	public String getLocalClient_ID() {
		return m_LocalClient_ID;
	}
	
	/**
	 * Set Local Client Identifier
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param m_LocalClient_ID
	 * @return void
	 */
	public void setLocalClient_ID(String m_LocalClient_ID) {
		this.m_LocalClient_ID = m_LocalClient_ID;
	}
}
