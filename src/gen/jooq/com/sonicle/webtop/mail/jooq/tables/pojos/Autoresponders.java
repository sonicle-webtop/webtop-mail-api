/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.mail.jooq.tables.pojos;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Autoresponders implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.lang.String       domainId;
    private java.lang.String       userId;
    private java.lang.Boolean      enabled;
    private java.lang.String       subject;
    private java.lang.String       message;
    private java.lang.String       addresses;
    private java.lang.Short        daysInterval;
    private org.joda.time.DateTime startDate;
    private org.joda.time.DateTime endDate;
    private java.lang.Boolean      skipMailingLists;

    public Autoresponders() {}

    public Autoresponders(Autoresponders value) {
        this.domainId = value.domainId;
        this.userId = value.userId;
        this.enabled = value.enabled;
        this.subject = value.subject;
        this.message = value.message;
        this.addresses = value.addresses;
        this.daysInterval = value.daysInterval;
        this.startDate = value.startDate;
        this.endDate = value.endDate;
        this.skipMailingLists = value.skipMailingLists;
    }

    public Autoresponders(
        java.lang.String       domainId,
        java.lang.String       userId,
        java.lang.Boolean      enabled,
        java.lang.String       subject,
        java.lang.String       message,
        java.lang.String       addresses,
        java.lang.Short        daysInterval,
        org.joda.time.DateTime startDate,
        org.joda.time.DateTime endDate,
        java.lang.Boolean      skipMailingLists
    ) {
        this.domainId = domainId;
        this.userId = userId;
        this.enabled = enabled;
        this.subject = subject;
        this.message = message;
        this.addresses = addresses;
        this.daysInterval = daysInterval;
        this.startDate = startDate;
        this.endDate = endDate;
        this.skipMailingLists = skipMailingLists;
    }

    /**
     * Getter for <code>mail.autoresponders.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return this.domainId;
    }

    /**
     * Setter for <code>mail.autoresponders.domain_id</code>.
     */
    public void setDomainId(java.lang.String domainId) {
        this.domainId = domainId;
    }

    /**
     * Getter for <code>mail.autoresponders.user_id</code>.
     */
    public java.lang.String getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>mail.autoresponders.user_id</code>.
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    /**
     * Getter for <code>mail.autoresponders.enabled</code>.
     */
    public java.lang.Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Setter for <code>mail.autoresponders.enabled</code>.
     */
    public void setEnabled(java.lang.Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Getter for <code>mail.autoresponders.subject</code>.
     */
    public java.lang.String getSubject() {
        return this.subject;
    }

    /**
     * Setter for <code>mail.autoresponders.subject</code>.
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }

    /**
     * Getter for <code>mail.autoresponders.message</code>.
     */
    public java.lang.String getMessage() {
        return this.message;
    }

    /**
     * Setter for <code>mail.autoresponders.message</code>.
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    /**
     * Getter for <code>mail.autoresponders.addresses</code>.
     */
    public java.lang.String getAddresses() {
        return this.addresses;
    }

    /**
     * Setter for <code>mail.autoresponders.addresses</code>.
     */
    public void setAddresses(java.lang.String addresses) {
        this.addresses = addresses;
    }

    /**
     * Getter for <code>mail.autoresponders.days_interval</code>.
     */
    public java.lang.Short getDaysInterval() {
        return this.daysInterval;
    }

    /**
     * Setter for <code>mail.autoresponders.days_interval</code>.
     */
    public void setDaysInterval(java.lang.Short daysInterval) {
        this.daysInterval = daysInterval;
    }

    /**
     * Getter for <code>mail.autoresponders.start_date</code>.
     */
    public org.joda.time.DateTime getStartDate() {
        return this.startDate;
    }

    /**
     * Setter for <code>mail.autoresponders.start_date</code>.
     */
    public void setStartDate(org.joda.time.DateTime startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter for <code>mail.autoresponders.end_date</code>.
     */
    public org.joda.time.DateTime getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for <code>mail.autoresponders.end_date</code>.
     */
    public void setEndDate(org.joda.time.DateTime endDate) {
        this.endDate = endDate;
    }

    /**
     * Getter for <code>mail.autoresponders.skip_mailing_lists</code>.
     */
    public java.lang.Boolean getSkipMailingLists() {
        return this.skipMailingLists;
    }

    /**
     * Setter for <code>mail.autoresponders.skip_mailing_lists</code>.
     */
    public void setSkipMailingLists(java.lang.Boolean skipMailingLists) {
        this.skipMailingLists = skipMailingLists;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Autoresponders (");

        sb.append(domainId);
        sb.append(", ").append(userId);
        sb.append(", ").append(enabled);
        sb.append(", ").append(subject);
        sb.append(", ").append(message);
        sb.append(", ").append(addresses);
        sb.append(", ").append(daysInterval);
        sb.append(", ").append(startDate);
        sb.append(", ").append(endDate);
        sb.append(", ").append(skipMailingLists);

        sb.append(")");
        return sb.toString();
    }
}
