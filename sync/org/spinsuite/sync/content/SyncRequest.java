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
	
	/**	Request Type				*/
	private String 					m_Type 					= null;
	/**	Topic Name					*/
	private String 					m_TopicName				= null;
	/**	Request Identifier			*/
	private String 					m_SPS_BC_Request_UUID 	= null;
	
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
	 * Set Request Identifier
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_SPS_BC_Request_UUID
	 * @return void
	 */
	public void setSPS_BC_Request_UUID(String p_SPS_BC_Request_UUID) {
		m_SPS_BC_Request_UUID = p_SPS_BC_Request_UUID;
	}
	
	/**
	 * Get Request Identifier
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return Stru=ing
	 */
	public String getSPS_BC_Request_UUID() {
		return m_SPS_BC_Request_UUID;
	}

	@Override
	public String toString() {
		return "SyncRequest [m_Type=" + m_Type + ", m_TopicName=" + m_TopicName
				+ ", m_SPS_BC_Request_UUID=" + m_SPS_BC_Request_UUID + "]";
	}
}