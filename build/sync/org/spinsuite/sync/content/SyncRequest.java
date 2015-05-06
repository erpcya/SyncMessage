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
		m_Users = new ArrayList<Invited>();
	}
	
	/**
	 * *** Constructor ***
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_LocalClient_ID
	 * @param p_Type
	 * @param p_TopicName
	 */
	public SyncRequest(String p_LocalClient_ID, String p_Type, String p_TopicName) {
		this(p_LocalClient_ID);
		m_Type = p_Type;
		m_TopicName = p_TopicName;
	}
	
	/**
	 * 
	 * *** Constructor ***
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_SPS_BC_Request_ID
	 * @param p_LocalClient_ID
	 * @param p_Type
	 * @param p_TopicName
	 * @param p_Name
	 * @param p_IsGroup
	 */
	public SyncRequest(int p_SPS_BC_Request_ID, String p_LocalClient_ID, String p_Type, String p_TopicName, String p_Name, boolean p_IsGroup) {
		this(p_LocalClient_ID, p_Type, p_TopicName);
		m_SPS_BC_Request_ID = p_SPS_BC_Request_ID;
		m_Name = p_Name;
		m_IsGroup = p_IsGroup;
	}
	
	/**	Request Type				*/
	private String 					m_Type 				= null;
	/**	Topic Name					*/
	private String 					m_TopicName			= null;
	/**	Name for Group				*/
	private String 					m_Name				= null;
	/**	Last Message				*/
	private String 					m_LastMsg			= null;
	/**	Request Identifier			*/
	private int 					m_SPS_BC_Request_ID = 0;
	/**	Detail						*/
	private ArrayList<Invited> 		m_Users				= null;
	/**	Is a Group					*/
	private boolean					m_IsGroup			= false;
	/**	Status						*/
	private String					m_Status = null;
	/**	Last Message				*/
	private String 					m_LastFileName		= null;
	
	/**	Request Type Constants		*/
	public static final String RT_BUSINESS_CHAT = "RT_BC";
	
	/**
	 * Get Request Type
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return String
	 */
	public String getType() {
		return m_Type;
	}
	
	/**
	 * Set Request Type
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_Type
	 * @return void
	 */
	public void setType(String p_Type) {
		m_Type = p_Type;
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
	 * Set Request Identifier
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_SPS_BC_Request_ID
	 * @return void
	 */
	public void setSPS_BC_Request_ID(int p_SPS_BC_Request_ID) {
		m_SPS_BC_Request_ID = p_SPS_BC_Request_ID;
	}
	
	/**
	 * Get Request Identifier
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return int
	 */
	public int getSPS_BC_Request_ID() {
		return m_SPS_BC_Request_ID;
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
	 * Get Status
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return String
	 */
	public String getStatus() {
		return m_Status;
	}

	/**
	 * Set Status
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_Status
	 * @return void
	 */
	public void setStatus(String p_Status) {
		m_Status = p_Status;
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
		return "SyncRequest [m_Type=" + m_Type + ", m_TopicName=" + m_TopicName
				+ ", m_Name=" + m_Name + ", m_LastMsg=" + m_LastMsg
				+ ", m_SPS_BC_Request_ID=" + m_SPS_BC_Request_ID + ", m_Users="
				+ m_Users + ", m_IsGroup=" + m_IsGroup + ", m_Status="
				+ m_Status + ", m_LastFileName=" + m_LastFileName + "]";
	}
}