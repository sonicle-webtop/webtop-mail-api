/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.mail.jooq.tables.records;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RulesCopyRecord extends org.jooq.impl.UpdatableRecordImpl<RulesCopyRecord> implements org.jooq.Record16<java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigInteger, java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mail.rules_copy.domain_id</code>.
     */
    public void setDomainId(java.lang.String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mail.rules_copy.domain_id</code>.
     */
    public java.lang.String getDomainId() {
        return (java.lang.String) get(0);
    }

    /**
     * Setter for <code>mail.rules_copy.user_id</code>.
     */
    public void setUserId(java.lang.String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mail.rules_copy.user_id</code>.
     */
    public java.lang.String getUserId() {
        return (java.lang.String) get(1);
    }

    /**
     * Setter for <code>mail.rules_copy.rule_id</code>.
     */
    public void setRuleId(java.lang.Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>mail.rules_copy.rule_id</code>.
     */
    public java.lang.Long getRuleId() {
        return (java.lang.Long) get(2);
    }

    /**
     * Setter for <code>mail.rules_copy.status</code>.
     */
    public void setStatus(java.lang.String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mail.rules_copy.status</code>.
     */
    public java.lang.String getStatus() {
        return (java.lang.String) get(3);
    }

    /**
     * Setter for <code>mail.rules_copy.continue</code>.
     */
    public void setContinue(java.lang.String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mail.rules_copy.continue</code>.
     */
    public java.lang.String getContinue() {
        return (java.lang.String) get(4);
    }

    /**
     * Setter for <code>mail.rules_copy.keep_copy</code>.
     */
    public void setKeepCopy(java.lang.String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mail.rules_copy.keep_copy</code>.
     */
    public java.lang.String getKeepCopy() {
        return (java.lang.String) get(5);
    }

    /**
     * Setter for <code>mail.rules_copy.condition</code>.
     */
    public void setCondition(java.lang.String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mail.rules_copy.condition</code>.
     */
    public java.lang.String getCondition() {
        return (java.lang.String) get(6);
    }

    /**
     * Setter for <code>mail.rules_copy.from_value</code>.
     */
    public void setFromValue(java.lang.String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mail.rules_copy.from_value</code>.
     */
    public java.lang.String getFromValue() {
        return (java.lang.String) get(7);
    }

    /**
     * Setter for <code>mail.rules_copy.to_value</code>.
     */
    public void setToValue(java.lang.String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mail.rules_copy.to_value</code>.
     */
    public java.lang.String getToValue() {
        return (java.lang.String) get(8);
    }

    /**
     * Setter for <code>mail.rules_copy.subject_value</code>.
     */
    public void setSubjectValue(java.lang.String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mail.rules_copy.subject_value</code>.
     */
    public java.lang.String getSubjectValue() {
        return (java.lang.String) get(9);
    }

    /**
     * Setter for <code>mail.rules_copy.size_match</code>.
     */
    public void setSizeMatch(java.lang.String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mail.rules_copy.size_match</code>.
     */
    public java.lang.String getSizeMatch() {
        return (java.lang.String) get(10);
    }

    /**
     * Setter for <code>mail.rules_copy.size_value</code>.
     */
    public void setSizeValue(java.math.BigInteger value) {
        set(11, value);
    }

    /**
     * Getter for <code>mail.rules_copy.size_value</code>.
     */
    public java.math.BigInteger getSizeValue() {
        return (java.math.BigInteger) get(11);
    }

    /**
     * Setter for <code>mail.rules_copy.field_name</code>.
     */
    public void setFieldName(java.lang.String value) {
        set(12, value);
    }

    /**
     * Getter for <code>mail.rules_copy.field_name</code>.
     */
    public java.lang.String getFieldName() {
        return (java.lang.String) get(12);
    }

    /**
     * Setter for <code>mail.rules_copy.field_value</code>.
     */
    public void setFieldValue(java.lang.String value) {
        set(13, value);
    }

    /**
     * Getter for <code>mail.rules_copy.field_value</code>.
     */
    public java.lang.String getFieldValue() {
        return (java.lang.String) get(13);
    }

    /**
     * Setter for <code>mail.rules_copy.action</code>.
     */
    public void setAction(java.lang.String value) {
        set(14, value);
    }

    /**
     * Getter for <code>mail.rules_copy.action</code>.
     */
    public java.lang.String getAction() {
        return (java.lang.String) get(14);
    }

    /**
     * Setter for <code>mail.rules_copy.action_value</code>.
     */
    public void setActionValue(java.lang.String value) {
        set(15, value);
    }

    /**
     * Getter for <code>mail.rules_copy.action_value</code>.
     */
    public java.lang.String getActionValue() {
        return (java.lang.String) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Record3<java.lang.String, java.lang.String, java.lang.Long> key() {
        return (org.jooq.Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row16<java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigInteger, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
        return (org.jooq.Row16) super.fieldsRow();
    }

    @java.lang.Override
    public org.jooq.Row16<java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigInteger, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
        return (org.jooq.Row16) super.valuesRow();
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field1() {
        return com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY.DOMAIN_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field2() {
        return com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY.USER_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.Long> field3() {
        return com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY.RULE_ID;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field4() {
        return com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY.STATUS;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field5() {
        return com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY.CONTINUE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field6() {
        return com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY.KEEP_COPY;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field7() {
        return com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY.CONDITION;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field8() {
        return com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY.FROM_VALUE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field9() {
        return com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY.TO_VALUE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field10() {
        return com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY.SUBJECT_VALUE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field11() {
        return com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY.SIZE_MATCH;
    }

    @java.lang.Override
    public org.jooq.Field<java.math.BigInteger> field12() {
        return com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY.SIZE_VALUE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field13() {
        return com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY.FIELD_NAME;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field14() {
        return com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY.FIELD_VALUE;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field15() {
        return com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY.ACTION;
    }

    @java.lang.Override
    public org.jooq.Field<java.lang.String> field16() {
        return com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY.ACTION_VALUE;
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
    public java.lang.Long component3() {
        return getRuleId();
    }

    @java.lang.Override
    public java.lang.String component4() {
        return getStatus();
    }

    @java.lang.Override
    public java.lang.String component5() {
        return getContinue();
    }

    @java.lang.Override
    public java.lang.String component6() {
        return getKeepCopy();
    }

    @java.lang.Override
    public java.lang.String component7() {
        return getCondition();
    }

    @java.lang.Override
    public java.lang.String component8() {
        return getFromValue();
    }

    @java.lang.Override
    public java.lang.String component9() {
        return getToValue();
    }

    @java.lang.Override
    public java.lang.String component10() {
        return getSubjectValue();
    }

    @java.lang.Override
    public java.lang.String component11() {
        return getSizeMatch();
    }

    @java.lang.Override
    public java.math.BigInteger component12() {
        return getSizeValue();
    }

    @java.lang.Override
    public java.lang.String component13() {
        return getFieldName();
    }

    @java.lang.Override
    public java.lang.String component14() {
        return getFieldValue();
    }

    @java.lang.Override
    public java.lang.String component15() {
        return getAction();
    }

    @java.lang.Override
    public java.lang.String component16() {
        return getActionValue();
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
    public java.lang.Long value3() {
        return getRuleId();
    }

    @java.lang.Override
    public java.lang.String value4() {
        return getStatus();
    }

    @java.lang.Override
    public java.lang.String value5() {
        return getContinue();
    }

    @java.lang.Override
    public java.lang.String value6() {
        return getKeepCopy();
    }

    @java.lang.Override
    public java.lang.String value7() {
        return getCondition();
    }

    @java.lang.Override
    public java.lang.String value8() {
        return getFromValue();
    }

    @java.lang.Override
    public java.lang.String value9() {
        return getToValue();
    }

    @java.lang.Override
    public java.lang.String value10() {
        return getSubjectValue();
    }

    @java.lang.Override
    public java.lang.String value11() {
        return getSizeMatch();
    }

    @java.lang.Override
    public java.math.BigInteger value12() {
        return getSizeValue();
    }

    @java.lang.Override
    public java.lang.String value13() {
        return getFieldName();
    }

    @java.lang.Override
    public java.lang.String value14() {
        return getFieldValue();
    }

    @java.lang.Override
    public java.lang.String value15() {
        return getAction();
    }

    @java.lang.Override
    public java.lang.String value16() {
        return getActionValue();
    }

    @java.lang.Override
    public RulesCopyRecord value1(java.lang.String value) {
        setDomainId(value);
        return this;
    }

    @java.lang.Override
    public RulesCopyRecord value2(java.lang.String value) {
        setUserId(value);
        return this;
    }

    @java.lang.Override
    public RulesCopyRecord value3(java.lang.Long value) {
        setRuleId(value);
        return this;
    }

    @java.lang.Override
    public RulesCopyRecord value4(java.lang.String value) {
        setStatus(value);
        return this;
    }

    @java.lang.Override
    public RulesCopyRecord value5(java.lang.String value) {
        setContinue(value);
        return this;
    }

    @java.lang.Override
    public RulesCopyRecord value6(java.lang.String value) {
        setKeepCopy(value);
        return this;
    }

    @java.lang.Override
    public RulesCopyRecord value7(java.lang.String value) {
        setCondition(value);
        return this;
    }

    @java.lang.Override
    public RulesCopyRecord value8(java.lang.String value) {
        setFromValue(value);
        return this;
    }

    @java.lang.Override
    public RulesCopyRecord value9(java.lang.String value) {
        setToValue(value);
        return this;
    }

    @java.lang.Override
    public RulesCopyRecord value10(java.lang.String value) {
        setSubjectValue(value);
        return this;
    }

    @java.lang.Override
    public RulesCopyRecord value11(java.lang.String value) {
        setSizeMatch(value);
        return this;
    }

    @java.lang.Override
    public RulesCopyRecord value12(java.math.BigInteger value) {
        setSizeValue(value);
        return this;
    }

    @java.lang.Override
    public RulesCopyRecord value13(java.lang.String value) {
        setFieldName(value);
        return this;
    }

    @java.lang.Override
    public RulesCopyRecord value14(java.lang.String value) {
        setFieldValue(value);
        return this;
    }

    @java.lang.Override
    public RulesCopyRecord value15(java.lang.String value) {
        setAction(value);
        return this;
    }

    @java.lang.Override
    public RulesCopyRecord value16(java.lang.String value) {
        setActionValue(value);
        return this;
    }

    @java.lang.Override
    public RulesCopyRecord values(java.lang.String value1, java.lang.String value2, java.lang.Long value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.String value8, java.lang.String value9, java.lang.String value10, java.lang.String value11, java.math.BigInteger value12, java.lang.String value13, java.lang.String value14, java.lang.String value15, java.lang.String value16) {
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
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RulesCopyRecord
     */
    public RulesCopyRecord() {
        super(com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY);
    }

    /**
     * Create a detached, initialised RulesCopyRecord
     */
    public RulesCopyRecord(java.lang.String domainId, java.lang.String userId, java.lang.Long ruleId, java.lang.String status, java.lang.String continue_, java.lang.String keepCopy, java.lang.String condition, java.lang.String fromValue, java.lang.String toValue, java.lang.String subjectValue, java.lang.String sizeMatch, java.math.BigInteger sizeValue, java.lang.String fieldName, java.lang.String fieldValue, java.lang.String action, java.lang.String actionValue) {
        super(com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY);

        setDomainId(domainId);
        setUserId(userId);
        setRuleId(ruleId);
        setStatus(status);
        setContinue(continue_);
        setKeepCopy(keepCopy);
        setCondition(condition);
        setFromValue(fromValue);
        setToValue(toValue);
        setSubjectValue(subjectValue);
        setSizeMatch(sizeMatch);
        setSizeValue(sizeValue);
        setFieldName(fieldName);
        setFieldValue(fieldValue);
        setAction(action);
        setActionValue(actionValue);
    }
}