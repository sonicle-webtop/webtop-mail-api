/*
 * Copyright (C) 2014 Sonicle S.r.l.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Affero General Public License version 3 as published by
 * the Free Software Foundation with the addition of the following permission
 * added to Section 15 as permitted in Section 7(a): FOR ANY PART OF THE COVERED
 * WORK IN WHICH THE COPYRIGHT IS OWNED BY SONICLE, SONICLE DISCLAIMS THE
 * WARRANTY OF NON INFRINGEMENT OF THIRD PARTY RIGHTS.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, see http://www.gnu.org/licenses or write to
 * the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301 USA.
 *
 * You can contact Sonicle S.r.l. at email address sonicle[at]sonicle[dot]com
 *
 * The interactive user interfaces in modified source and object code versions
 * of this program must display Appropriate Legal Notices, as required under
 * Section 5 of the GNU Affero General Public License version 3.
 *
 * In accordance with Section 7(b) of the GNU Affero General Public License
 * version 3, these Appropriate Legal Notices must retain the display of the
 * Sonicle logo and Sonicle copyright notice. If the display of the logo is not
 * reasonably feasible for technical reasons, the Appropriate Legal Notices must
 * display the words "Copyright (C) 2014 Sonicle S.r.l.".
 */
package com.sonicle.webtop.mail.model;

/**
 *
 * @author Inis
 */
public class ExternalAccount {
	
	protected Integer externalAccountId;
	protected String displayName;
	protected String accountDescription;
	protected String email;
	protected String protocol;
	protected String host;
	protected Integer port;
	protected String userName;
	protected String password;
	protected String folderPrefix;
	protected String folderSent;
	protected String folderDrafts;
	protected String folderTrash;
	protected String folderSpam;
	protected String folderArchive;

	public Integer getExternalAccountId() {
		return externalAccountId;
	}

	public void setExternalAccountId(Integer externalAccountId) {
		this.externalAccountId = externalAccountId;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getAccountDescription() {
		return accountDescription;
	}

	public void setAccountDescription(String accountDescription) {
		this.accountDescription = accountDescription;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFolderPrefix() {
		return folderPrefix;
	}

	public void setFolderPrefix(String folderPrefix) {
		this.folderPrefix = folderPrefix;
	}

	public String getFolderSent() {
		return folderSent;
	}

	public void setFolderSent(String folderSent) {
		this.folderSent = folderSent;
	}

	public String getFolderDrafts() {
		return folderDrafts;
	}

	public void setFolderDrafts(String folderDrafts) {
		this.folderDrafts = folderDrafts;
	}

	public String getFolderTrash() {
		return folderTrash;
	}

	public void setFolderTrash(String folderTrash) {
		this.folderTrash = folderTrash;
	}

	public String getFolderSpam() {
		return folderSpam;
	}

	public void setFolderSpam(String folderSpam) {
		this.folderSpam = folderSpam;
	}

	public String getFolderArchive() {
		return folderArchive;
	}

	public void setFolderArchive(String folderArchive) {
		this.folderArchive = folderArchive;
	}
	
}
