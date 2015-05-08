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
 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com May 8, 2015, 9:29:47 AM
 *
 */
public class SyncRequest_BC extends SyncRequest {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 159413855464977912L;

	/**
	 * *** Constructor ***
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_SPS_BC_Request_UUID
	 * @param p_LocalClient_ID
	 * @param p_TopicName
	 * @param p_Name
	 * @param p_LastMsg
	 * @param p_LastFileName
	 * @param p_IsGroup
	 */
	public SyncRequest_BC(String p_SPS_BC_Request_UUID,
			String p_LocalClient_ID, String p_TopicName,
			String p_Name, String p_LastMsg, String p_LastFileName,
			boolean p_IsGroup) {
		super(p_LocalClient_ID, RT_BUSINESS_CHAT, p_TopicName);
		setSPS_BC_Request_UUID(p_SPS_BC_Request_UUID);
		setName(p_Name);
		setLastMsg(p_LastMsg);
		setLastFileName(p_LastFileName);
		setIsGroup(p_IsGroup);
		//	Instance Users
		m_Users = new ArrayList<Invited>();
	}
	
	/**	Name for Group				*/
	private String 					m_Name					= null;
	/**	Is a Group					*/
	private boolean					m_IsGroup				= false;
	/**	Last Message				*/
	private String 					m_LastMsg				= null;
	/**	Last Message				*/
	private String 					m_LastFileName			= null;
	/**	Detail						*/
	private ArrayList<Invited> 		m_Users					= null;
	
	/**	Request Type Constants		*/
	public static final String RT_BUSINESS_CHAT = "RT_BC";
	
	/**
	 * Get Last Message
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return String
	 */
	public String getLastMsg() {
		return m_LastMsg;
	}

	/**
	 * Set Last Message
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_LastMsg
	 * @return void
	 */
	public void setLastMsg(String p_LastMsg) {
		m_LastMsg = p_LastMsg;
	}
	
	/**
	 * Get Name, usually use for group
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return String
	 */
	public String getName() {
		return m_Name;
	}

	/**
	 * Set Name for Group
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_Name
	 * @return void
	 */
	public void setName(String p_Name) {
		m_Name = p_Name;
	}

	/**
	 * Get Users Detail
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return ArrayList<Integer>
	 */
	public ArrayList<Invited> getUsers() {
		return m_Users;
	}
	
	/**
	 * Set Users detail
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_Users
	 * @return void
	 */
	public void setUsers(ArrayList<Invited> p_Users) {
		m_Users = p_Users;
	}
	
	/**
	 * Add a User for Request
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_User
	 * @return void
	 */
	public void addUser(Invited p_User) {
		m_Users.add(p_User);
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
	
	/**
	 * Set is Group Attribute 
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_IsGroup
	 * @return void
	 */
	public void setIsGroup(boolean p_IsGroup) {
		m_IsGroup = p_IsGroup;
	}
	
	/**
	 * Get Is Group Attribute
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return boolean
	 */
	public boolean isGroup() {
		return m_IsGroup;
	}
	
	/**
	 * Get Last File Name
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return String
	 */
	public String getLastFileName() {
		return m_LastFileName;
	}

	/**
	 * Set Last File Name
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_LastFileName
	 * @return void
	 */
	public void setLastFileName(String p_LastFileName) {
		m_LastFileName = p_LastFileName;
	}

	@Override
	public String toString() {
		return "SyncRequestBCMessage [m_Name=" + m_Name + ", m_LastMsg="
				+ m_LastMsg + ", m_IsGroup=" + m_IsGroup + ", m_LastFileName="
				+ m_LastFileName + ", m_Users=" + m_Users + "]";
	}
}
