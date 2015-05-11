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
 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com May 7, 2015, 7:15:56 PM
 *
 */
public class SyncAcknowledgment extends SyncParent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4124825209968125871L;

	/**
	 * *** Constructor ***
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_LocalClient_ID
	 */
	public SyncAcknowledgment(String p_LocalClient_ID) {
		super(p_LocalClient_ID);
	}

	/**	Request Identifier		*/
	private String 	m_SPS_BC_Request_UUID 	= null;
	/**	Message Identifier		*/
	private String 	m_SPS_BC_Message_UUID 	= null;
	/**	User Identifier			*/
	private int 	m_AD_User_ID			= 0;
	/**	Status					*/
	private String	m_Status 				= null;
	
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
	 * @return String
	 */
	public String getSPS_BC_Request_UUID() {
		return m_SPS_BC_Request_UUID;
	}
	
	/**
	 * Set Request Identifier
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_SPS_BC_Message_UUID
	 * @return void
	 */
	public void setSPS_BC_Message_UUID(String p_SPS_BC_Message_UUID) {
		m_SPS_BC_Message_UUID = p_SPS_BC_Message_UUID;
	}
	
	/**
	 * Get Message Identifier
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return String
	 */
	public String getSPS_BC_Message_UUID() {
		return m_SPS_BC_Message_UUID;
	}
	
	/**
	 * Set User Idcentifier
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_AD_User_ID
	 * @return void
	 */
	public void setAD_User_ID(int p_AD_User_ID) {
		m_AD_User_ID = p_AD_User_ID;
	}
	
	/**
	 * Get User Identifier
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return int
	 */
	public int getAD_User_ID() {
		return m_AD_User_ID;
	}
	
	/**
	 * Set Status of Request for User
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_Status
	 * @return void
	 */
	public void setStatus(String p_Status) {
		m_Status = p_Status;
	}
	
	/**
	 * Get Invited Status
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return String
	 */
	public String getStatus() {
		return m_Status;
	}

	@Override
	public String toString() {
		return "SyncAcknowledgment [m_SPS_BC_Request_UUID="
				+ m_SPS_BC_Request_UUID + ", m_SPS_BC_Message_UUID="
				+ m_SPS_BC_Message_UUID + ", m_AD_User_ID=" + m_AD_User_ID
				+ ", m_Status=" + m_Status + "]";
	}
}
