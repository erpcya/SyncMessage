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

import java.util.ArrayList;

/**
 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com Apr 1, 2015, 11:19:59 PM
 *
 */
public class SyncRequest extends SyncParent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7089811705947299113L;

	/**
	 * *** Constructor ***
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_LocalClient_ID
	 */
	public SyncRequest(String p_LocalClient_ID) {
		super(p_LocalClient_ID);
		m_Users = new ArrayList<Integer>();
	}
	
	/**
	 * Full
	 * *** Constructor ***
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_LocalClient_ID
	 * @param p_RequestType
	 * @param p_TopicName
	 */
	public SyncRequest(String p_LocalClient_ID, String p_RequestType, String p_TopicName) {
		this(p_LocalClient_ID);
		m_RequestType = p_RequestType;
		m_TopicName = p_TopicName;
	}
	
	/**	Request Type				*/
	private String 						m_RequestType 	= null;
	/**	Topic Name					*/
	private String 						m_TopicName		= null;
	/**	Detail						*/
	private ArrayList<Integer> 			m_Users			= null;
	
	/**	Request Type Constants		*/
	public static final String RT_BUSINESS_CHAT = "RT_BC";
	
	/**
	 * Get Request Type
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return String
	 */
	public String getRequestType() {
		return m_RequestType;
	}
	
	/**
	 * Set Request Type
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_RequestType
	 * @return void
	 */
	public void setRequestType(String p_RequestType) {
		m_RequestType = p_RequestType;
	}
	
	/**
	 * Get Topic Name
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return String
	 */
	public String getTopicName() {
		return m_TopicName;
	}

	/**
	 * Set Topic Name for Chat
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_TopicName
	 * @return void
	 */
	public void setTopicName(String p_TopicName) {
		m_TopicName = p_TopicName;
	}
	
	/**
	 * Get Users Detail
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return ArrayList<Integer>
	 */
	public ArrayList<Integer> getUsers() {
		return m_Users;
	}
	
	/**
	 * Set Users detail
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_Users
	 * @return void
	 */
	public void setUsers(ArrayList<Integer> p_Users) {
		m_Users = p_Users;
	}
	
	/**
	 * Add a User for Request
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_AD_User_ID
	 * @return void
	 */
	public void addUser(int p_AD_User_ID) {
		m_Users.add(p_AD_User_ID);
	}
	
	/**
	 * Get Invited Qty
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return int
	 */
	public int getIvitedQty() {
		//	Valid Null Pinter
		if(m_Users == null)
			return 0;
		//	Default return
		return m_Users.size();
	}

	@Override
	public String toString() {
		return "SyncRequest [m_RequestType=" + m_RequestType + ", m_TopicName="
				+ m_TopicName + ", m_Users=" + m_Users + "]";
	}
}