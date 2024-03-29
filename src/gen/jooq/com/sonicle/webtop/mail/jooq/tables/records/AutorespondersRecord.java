/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.mail.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AutorespondersRecord extends org.jooq.impl.UpdatableRecordImpl<AutorespondersRecord> implements org.jooq.Record10<java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Short, org.joda.time.DateTime, org.joda.time.DateTime, java.lang.Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mail.autoresponders.domain_id</code>.
     */
    public void setDomainId(java.lang.String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mail.autoresponders.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return (java.lang.String) get(0);
    }

    /**
     * Setter for <code>mail.autoresponders.user_id</code>.
     */
    public void setUserId(java.lang.String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mail.autoresponders.user_id</code>.
     */
    public java.lang.String getUserId() {
        return (java.lang.String) get(1);
    }

    /**
     * Setter for <code>mail.autoresponders.enabled</code>.
     */
    public void setEnabled(java.lang.Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>mail.autoresponders.enabled</code>.
     */
    public java.lang.Boolean getEnabled() {
        return (java.lang.Boolean) get(2);
    }

    /**
     * Setter for <code>mail.autoresponders.subject</code>.
     */
    public void setSubject(java.lang.String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mail.autoresponders.subject</code>.
     */
    public java.lang.String getSubject() {
        return (java.lang.String) get(3);
    }

    /**
     * Setter for <code>mail.autoresponders.message</code>.
     */
    public void setMessage(java.lang.String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mail.autoresponders.message</code>.
     */
    public java.lang.String getMessage() {
        return (java.lang.String) get(4);
    }

    /**
     * Setter for <code>mail.autoresponders.addresses</code>.
     */
    public void setAddresses(java.lang.String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mail.autoresponders.addresses</code>.
     */
    public java.lang.String getAddresses() {
        return (java.lang.String) get(5);
    }

    /**
     * Setter for <code>mail.autoresponders.days_interval</code>.
     */
    public void setDaysInterval(java.lang.Short value) {
        set(6, value);
    }

    /**
     * Getter for <code>mail.autoresponders.days_interval</code>.
     */
    public java.lang.Short getDaysInterval() {
        return (java.lang.Short) get(6);
    }

    /**
     * Setter for <code>mail.autoresponders.start_date</code>.
     */
    public void setStartDate(org.joda.time.DateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>mail.autoresponders.start_date</code>.
     */
    public org.joda.time.DateTime getStartDate() {
        return (org.joda.time.DateTime) get(7);
    }

    /**
     * Setter for <code>mail.autoresponders.end_date</code>.
     */
    public void setEndDate(org.joda.time.DateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>mail.autoresponders.end_date</code>.
     */
    public org.joda.time.DateTime getEndDate() {
        return (org.joda.time.DateTime) get(8);
    }

    /**
     * Setter for <code>mail.autoresponders.skip_mailing_lists</code>.
     */
    public void setSkipMailingLists(java.lang.Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>mail.autoresponders.skip_mailing_lists</code>.
     */
    public java.lang.Boolean getSkipMailingLists() {
        return (java.lang.Boolean) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record2<java.lang.String, java.lang.String> key() {
        return (org.jooq.Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row10<java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Short, org.joda.time.DateTime, org.joda.time.DateTime, java.lang.Boolean> fieldsRow() {
        return (org.jooq.Row10) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row10<java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Short, org.joda.time.DateTime, org.joda.time.DateTime, java.lang.Boolean> valuesRow() {
        return (org.jooq.Row10) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field1() {
        return com.sonicle.webtop.mail.jooq.tables.Autoresponders.AUTORESPONDERS.DOMAIN_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field2() {
        return com.sonicle.webtop.mail.jooq.tables.Autoresponders.AUTORESPONDERS.USER_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Boolean> field3() {
        return com.sonicle.webtop.mail.jooq.tables.Autoresponders.AUTORESPONDERS.ENABLED;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field4() {
        return com.sonicle.webtop.mail.jooq.tables.Autoresponders.AUTORESPONDERS.SUBJECT;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field5() {
        return com.sonicle.webtop.mail.jooq.tables.Autoresponders.AUTORESPONDERS.MESSAGE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field6() {
        return com.sonicle.webtop.mail.jooq.tables.Autoresponders.AUTORESPONDERS.ADDRESSES;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Short> field7() {
        return com.sonicle.webtop.mail.jooq.tables.Autoresponders.AUTORESPONDERS.DAYS_INTERVAL;
    }

    @java.lang.Override
    public org.jooq.Field<org.joda.time.DateTime> field8() {
        return com.sonicle.webtop.mail.jooq.tables.Autoresponders.AUTORESPONDERS.START_DATE;
    }

    @java.lang.Override
    public org.jooq.Field<org.joda.time.DateTime> field9() {
        return com.sonicle.webtop.mail.jooq.tables.Autoresponders.AUTORESPONDERS.END_DATE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Boolean> field10() {
        return com.sonicle.webtop.mail.jooq.tables.Autoresponders.AUTORESPONDERS.SKIP_MAILING_LISTS;
    }

    @java.lang.Override
    public java.lang.String component1() {
        return getDomainId();
    }

    @java.lang.Override
    public java.lang.String component2() {
        return getUserId();
    }

    @java.lang.Override
    public java.lang.Boolean component3() {
        return getEnabled();
    }

    @java.lang.Override
    public java.lang.String component4() {
        return getSubject();
    }

    @java.lang.Override
    public java.lang.String component5() {
        return getMessage();
    }

    @java.lang.Override
    public java.lang.String component6() {
        return getAddresses();
    }

    @java.lang.Override
    public java.lang.Short component7() {
        return getDaysInterval();
    }

    @java.lang.Override
    public org.joda.time.DateTime component8() {
        return getStartDate();
    }

    @java.lang.Override
    public org.joda.time.DateTime component9() {
        return getEndDate();
    }

    @java.lang.Override
    public java.lang.Boolean component10() {
        return getSkipMailingLists();
    }

    @java.lang.Override
    public java.lang.String value1() {
        return getDomainId();
    }

    @java.lang.Override
    public java.lang.String value2() {
        return getUserId();
    }

    @java.lang.Override
    public java.lang.Boolean value3() {
        return getEnabled();
    }

    @java.lang.Override
    public java.lang.String value4() {
        return getSubject();
    }

    @java.lang.Override
    public java.lang.String value5() {
        return getMessage();
    }

    @java.lang.Override
    public java.lang.String value6() {
        return getAddresses();
    }

    @java.lang.Override
    public java.lang.Short value7() {
        return getDaysInterval();
    }

    @java.lang.Override
    public org.joda.time.DateTime value8() {
        return getStartDate();
    }

    @java.lang.Override
    public org.joda.time.DateTime value9() {
        return getEndDate();
    }

    @java.lang.Override
    public java.lang.Boolean value10() {
        return getSkipMailingLists();
    }

    @java.lang.Override
    public AutorespondersRecord value1(java.lang.String value) {
        setDomainId(value);
        return this;
    }

    @java.lang.Override
    public AutorespondersRecord value2(java.lang.String value) {
        setUserId(value);
        return this;
    }

    @java.lang.Override
    public AutorespondersRecord value3(java.lang.Boolean value) {
        setEnabled(value);
        return this;
    }

    @java.lang.Override
    public AutorespondersRecord value4(java.lang.String value) {
        setSubject(value);
        return this;
    }

    @java.lang.Override
    public AutorespondersRecord value5(java.lang.String value) {
        setMessage(value);
        return this;
    }

    @java.lang.Override
    public AutorespondersRecord value6(java.lang.String value) {
        setAddresses(value);
        return this;
    }

    @java.lang.Override
    public AutorespondersRecord value7(java.lang.Short value) {
        setDaysInterval(value);
        return this;
    }

    @java.lang.Override
    public AutorespondersRecord value8(org.joda.time.DateTime value) {
        setStartDate(value);
        return this;
    }

    @java.lang.Override
    public AutorespondersRecord value9(org.joda.time.DateTime value) {
        setEndDate(value);
        return this;
    }

    @java.lang.Override
    public AutorespondersRecord value10(java.lang.Boolean value) {
        setSkipMailingLists(value);
        return this;
    }

    @java.lang.Override
    public AutorespondersRecord values(java.lang.String value1, java.lang.String value2, java.lang.Boolean value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.Short value7, org.joda.time.DateTime value8, org.joda.time.DateTime value9, java.lang.Boolean value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AutorespondersRecord
     */
    public AutorespondersRecord() {
        super(com.sonicle.webtop.mail.jooq.tables.Autoresponders.AUTORESPONDERS);
    }

    /**
     * Create a detached, initialised AutorespondersRecord
     */
    public AutorespondersRecord(java.lang.String domainId, java.lang.String userId, java.lang.Boolean enabled, java.lang.String subject, java.lang.String message, java.lang.String addresses, java.lang.Short daysInterval, org.joda.time.DateTime startDate, org.joda.time.DateTime endDate, java.lang.Boolean skipMailingLists) {
        super(com.sonicle.webtop.mail.jooq.tables.Autoresponders.AUTORESPONDERS);

        setDomainId(domainId);
        setUserId(userId);
        setEnabled(enabled);
        setSubject(subject);
        setMessage(message);
        setAddresses(addresses);
        setDaysInterval(daysInterval);
        setStartDate(startDate);
        setEndDate(endDate);
        setSkipMailingLists(skipMailingLists);
    }
}
