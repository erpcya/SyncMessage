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

import java.util.Arrays;

/**
 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com Mar 27, 2015, 1:46:38 PM
 *
 */
public class SyncMessage_BC extends SyncParent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7361997519210006596L;

	/**
	 * *** Constructor ***
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_LocalClient_ID
	 */
	public SyncMessage_BC(String p_LocalClient_ID) {
		super(p_LocalClient_ID);
	}
	
	/**
	 * 
	 * *** Full Constructor ***
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_LocalClient_ID
	 * @param p_Text
	 * @param p_FileName
	 * @param p_Attachment
	 * @param p_SPS_BC_Request_ID
	 * @param p_AD_User_ID
	 * @param p_UserName
	 * @param p_TopicName
	 */
	public SyncMessage_BC(String p_SPS_BC_Message_UUID, String p_LocalClient_ID, String p_SPS_BC_Request_UUID, 
			int p_AD_User_ID, String p_UserName, String p_Text, String p_FileName, 
			byte[] p_Attachment) {
		super(p_LocalClient_ID);
		setSPS_BC_Message_UUID(p_SPS_BC_Message_UUID);
		setSPS_BC_Request_UUID(p_SPS_BC_Request_UUID);
		setAD_User_ID(p_AD_User_ID);
		setUserName(p_UserName);
		setText(p_Text);
		setFileName(p_FileName);
		setAttachment(p_Attachment);
	}
	
	/**	Request Identifier		*/
	private String 	m_SPS_BC_Request_UUID 	= null;
	/**	Message Identifier		*/
	private String 	m_SPS_BC_Message_UUID 	= null;
	/**	User Identifier			*/
	private int 	m_AD_User_ID			= 0;
	/**	User Name				*/
	private String 	m_UserName				= null;
	/**	Name					*/
	private String 	m_Text 					= null;
	/**	File Name				*/
	private String 	m_FileName				= null;
	/**	Attachment				*/
	private byte[]	m_Attachment 			= null;

	
	/**
	 * Get Text
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return String
	 */
	public String getText() {
		return m_Text;
	}
	
	/**
	 * Set Text for Message
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_Text
	 * @return void
	 */
	public void setText(String p_Text) {
		m_Text = p_Text;
	}
	
	/**
	 * Get User Name
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return String
	 */
	public String getUserName() {
		return m_UserName;
	}
	
	/**
	 * Set User Name
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_UserName
	 * @return void
	 */
	public void setUserName(String p_UserName) {
		m_UserName = p_UserName;
	}
	
	/**
	 * Get Message Attachment
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return byte[]
	 */
	public byte[] getAttachment() {
		return m_Attachment;
	}
	
	/**
	 * Set Attachment
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_Attachment
	 * @return void
	 */
	public void setAttachment(byte[] p_Attachment) {
		m_Attachment = p_Attachment;
	}
	
	/**
	 * Get File Name
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @return
	 * @return String
	 */
	public String getFileName() {
		return m_FileName;
	}
	
	/**
	 * Set Name of File
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_FileName
	 * @return void
	 */
	public void setFileName(String p_FileName) {
		m_FileName = p_FileName;
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

	@Override
	public String toString() {
		return "SyncMessage_BC [m_SPS_BC_Request_UUID=" + m_SPS_BC_Request_UUID
				+ ", m_SPS_BC_Message_UUID=" + m_SPS_BC_Message_UUID
				+ ", m_AD_User_ID=" + m_AD_User_ID + ", m_UserName="
				+ m_UserName + ", m_Text=" + m_Text + ", m_FileName="
				+ m_FileName + ", m_Attachment="
				+ Arrays.toString(m_Attachment) + "]";
	}
}
