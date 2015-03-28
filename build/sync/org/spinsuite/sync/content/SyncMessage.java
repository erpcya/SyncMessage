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
 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com Mar 27, 2015, 1:46:38 PM
 *
 */
public class SyncMessage extends SyncParent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7361997519210006596L;

	/**
	 * *** Constructor ***
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_LocalClient_ID
	 */
	public SyncMessage(String p_LocalClient_ID) {
		super(p_LocalClient_ID);
	}
	
	/**
	 * Full Constructor
	 * *** Constructor ***
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_LocalClient_ID
	 * @param p_Text
	 * @param p_FileName
	 * @param p_Attachment
	 */
	public SyncMessage(String p_LocalClient_ID, String p_Text, String p_FileName, byte[] p_Attachment) {
		super(p_LocalClient_ID);
		m_Text = p_Text;
		m_FileName = p_FileName;
		m_Attachment = p_Attachment;
	}
	
	/**
	 * 
	 * *** Constructor ***
	 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
	 * @param p_LocalClient_ID
	 * @param p_Text
	 */
	public SyncMessage(String p_LocalClient_ID, String p_Text) {
		super(p_LocalClient_ID);
		m_Text = p_Text;
	}
	
	/**	Name					*/
	private String 	m_Text 			= null;
	/**	File Name				*/
	private String 	m_FileName		= null;
	/**	Attachment				*/
	private byte[]	m_Attachment 	= null;
	
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
}
