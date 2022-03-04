/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.mail.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InFilters extends org.jooq.impl.TableImpl<com.sonicle.webtop.mail.jooq.tables.records.InFiltersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mail.in_filters</code>
     */
    public static final InFilters IN_FILTERS = new InFilters();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.mail.jooq.tables.records.InFiltersRecord> getRecordType() {
        return com.sonicle.webtop.mail.jooq.tables.records.InFiltersRecord.class;
    }

    /**
     * The column <code>mail.in_filters.in_filter_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.InFiltersRecord, java.lang.Integer> IN_FILTER_ID = createField(org.jooq.impl.DSL.name("in_filter_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('mail.seq_in_filters'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mail.in_filters.domain_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.InFiltersRecord, java.lang.String> DOMAIN_ID = createField(org.jooq.impl.DSL.name("domain_id"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>mail.in_filters.user_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.InFiltersRecord, java.lang.String> USER_ID = createField(org.jooq.impl.DSL.name("user_id"), org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>mail.in_filters.enabled</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.InFiltersRecord, java.lang.Boolean> ENABLED = createField(org.jooq.impl.DSL.name("enabled"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>mail.in_filters.order</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.InFiltersRecord, java.lang.Short> ORDER = createField(org.jooq.impl.DSL.name("order"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>mail.in_filters.name</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.InFiltersRecord, java.lang.String> NAME = createField(org.jooq.impl.DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>mail.in_filters.sieve_match</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.InFiltersRecord, java.lang.String> SIEVE_MATCH = createField(org.jooq.impl.DSL.name("sieve_match"), org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>mail.in_filters.sieve_rules</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.InFiltersRecord, java.lang.String> SIEVE_RULES = createField(org.jooq.impl.DSL.name("sieve_rules"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>mail.in_filters.sieve_actions</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.InFiltersRecord, java.lang.String> SIEVE_ACTIONS = createField(org.jooq.impl.DSL.name("sieve_actions"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    private InFilters(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.mail.jooq.tables.records.InFiltersRecord> aliased) {
        this(alias, aliased, null);
    }

    private InFilters(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.mail.jooq.tables.records.InFiltersRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.table());
    }

    /**
     * Create an aliased <code>mail.in_filters</code> table reference
     */
    public InFilters(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), IN_FILTERS);
    }

    /**
     * Create an aliased <code>mail.in_filters</code> table reference
     */
    public InFilters(org.jooq.Name alias) {
        this(alias, IN_FILTERS);
    }

    /**
     * Create a <code>mail.in_filters</code> table reference
     */
    public InFilters() {
        this(org.jooq.impl.DSL.name("in_filters"), null);
    }

    public <O extends org.jooq.Record> InFilters(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.mail.jooq.tables.records.InFiltersRecord> key) {
        super(child, key, IN_FILTERS);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.mail.jooq.Mail.MAIL;
    }

    @java.lang.Override
    public java.util.List<org.jooq.Index> getIndexes() {
        return java.util.Arrays.<org.jooq.Index>asList(com.sonicle.webtop.mail.jooq.Indexes.IN_FILTERS_AK1);
    }

    @java.lang.Override
    public org.jooq.UniqueKey<com.sonicle.webtop.mail.jooq.tables.records.InFiltersRecord> getPrimaryKey() {
        return com.sonicle.webtop.mail.jooq.Keys.IN_FILTERS_PKEY;
    }

    @java.lang.Override
    public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.mail.jooq.tables.records.InFiltersRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.mail.jooq.tables.records.InFiltersRecord>>asList(com.sonicle.webtop.mail.jooq.Keys.IN_FILTERS_PKEY);
    }

    @java.lang.Override
    public InFilters as(java.lang.String alias) {
        return new InFilters(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public InFilters as(org.jooq.Name alias) {
        return new InFilters(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public InFilters rename(java.lang.String name) {
        return new InFilters(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public InFilters rename(org.jooq.Name name) {
        return new InFilters(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row9<java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Short, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
        return (org.jooq.Row9) super.fieldsRow();
    }
}
