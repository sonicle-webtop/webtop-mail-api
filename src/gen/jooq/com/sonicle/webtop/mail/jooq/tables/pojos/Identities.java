/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.mail.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Identities implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.Integer identityId;
    private java.lang.String  domainId;
    private java.lang.String  userId;
    private java.lang.String  email;
    private java.lang.String  displayName;
    private java.lang.String  mainFolder;
    private java.lang.Boolean fax;
    private java.lang.String  identityUid;

    public Identities() {}

    public Identities(Identities value) {
        this.identityId = value.identityId;
        this.domainId = value.domainId;
        this.userId = value.userId;
        this.email = value.email;
        this.displayName = value.displayName;
        this.mainFolder = value.mainFolder;
        this.fax = value.fax;
        this.identityUid = value.identityUid;
    }

    public Identities(
        java.lang.Integer identityId,
        java.lang.String  domainId,
        java.lang.String  userId,
        java.lang.String  email,
        java.lang.String  displayName,
        java.lang.String  mainFolder,
        java.lang.Boolean fax,
        java.lang.String  identityUid
    ) {
        this.identityId = identityId;
        this.domainId = domainId;
        this.userId = userId;
        this.email = email;
        this.displayName = displayName;
        this.mainFolder = mainFolder;
        this.fax = fax;
        this.identityUid = identityUid;
    }

    /**
     * Getter for <code>mail.identities.identity_id</code>.
     */
    public java.lang.Integer getIdentityId() {
        return this.identityId;
    }

    /**
     * Setter for <code>mail.identities.identity_id</code>.
     */
    public void setIdentityId(java.lang.Integer identityId) {
        this.identityId = identityId;
    }

    /**
     * Getter for <code>mail.identities.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return this.domainId;
    }

    /**
     * Setter for <code>mail.identities.domain_id</code>.
     */
    public void setDomainId(java.lang.String domainId) {
        this.domainId = domainId;
    }

    /**
     * Getter for <code>mail.identities.user_id</code>.
     */
    public java.lang.String getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>mail.identities.user_id</code>.
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>mail.identities.email</code>.
     */
    public java.lang.String getEmail() {
        return this.email;
    }

    /**
     * Setter for <code>mail.identities.email</code>.
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    /**
     * Getter for <code>mail.identities.display_name</code>.
     */
    public java.lang.String getDisplayName() {
        return this.displayName;
    }

    /**
     * Setter for <code>mail.identities.display_name</code>.
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }

    /**
     * Getter for <code>mail.identities.main_folder</code>.
     */
    public java.lang.String getMainFolder() {
        return this.mainFolder;
    }

    /**
     * Setter for <code>mail.identities.main_folder</code>.
     */
    public void setMainFolder(java.lang.String mainFolder) {
        this.mainFolder = mainFolder;
    }

    /**
     * Getter for <code>mail.identities.fax</code>.
     */
    public java.lang.Boolean getFax() {
        return this.fax;
    }

    /**
     * Setter for <code>mail.identities.fax</code>.
     */
    public void setFax(java.lang.Boolean fax) {
        this.fax = fax;
    }

    /**
     * Getter for <code>mail.identities.identity_uid</code>.
     */
    public java.lang.String getIdentityUid() {
        return this.identityUid;
    }

    /**
     * Setter for <code>mail.identities.identity_uid</code>.
     */
    public void setIdentityUid(java.lang.String identityUid) {
        this.identityUid = identityUid;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Identities (");

        sb.append(identityId);
        sb.append(", ").append(domainId);
        sb.append(", ").append(userId);
        sb.append(", ").append(email);
        sb.append(", ").append(displayName);
        sb.append(", ").append(mainFolder);
        sb.append(", ").append(fax);
        sb.append(", ").append(identityUid);

        sb.append(")");
        return sb.toString();
    }
}
