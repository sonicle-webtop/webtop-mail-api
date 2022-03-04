/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.mail.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Scan implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.String domainId;
    private java.lang.String userId;
    private java.lang.String foldername;

    public Scan() {}

    public Scan(Scan value) {
        this.domainId = value.domainId;
        this.userId = value.userId;
        this.foldername = value.foldername;
    }

    public Scan(
        java.lang.String domainId,
        java.lang.String userId,
        java.lang.String foldername
    ) {
        this.domainId = domainId;
        this.userId = userId;
        this.foldername = foldername;
    }

    /**
     * Getter for <code>mail.scan.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return this.domainId;
    }

    /**
     * Setter for <code>mail.scan.domain_id</code>.
     */
    public void setDomainId(java.lang.String domainId) {
        this.domainId = domainId;
    }

    /**
     * Getter for <code>mail.scan.user_id</code>.
     */
    public java.lang.String getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>mail.scan.user_id</code>.
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>mail.scan.foldername</code>.
     */
    public java.lang.String getFoldername() {
        return this.foldername;
    }

    /**
     * Setter for <code>mail.scan.foldername</code>.
     */
    public void setFoldername(java.lang.String foldername) {
        this.foldername = foldername;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Scan (");

        sb.append(domainId);
        sb.append(", ").append(userId);
        sb.append(", ").append(foldername);

        sb.append(")");
        return sb.toString();
    }
}
