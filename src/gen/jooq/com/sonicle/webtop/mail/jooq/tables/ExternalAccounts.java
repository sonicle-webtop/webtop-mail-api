/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.mail.jooq.tables;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExternalAccounts extends org.jooq.impl.TableImpl<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mail.external_accounts</code>
     */
    public static final ExternalAccounts EXTERNAL_ACCOUNTS = new ExternalAccounts();

    /**
     * The class holding records for this type
     */
    @java.lang.Override
    public java.lang.Class<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord> getRecordType() {
        return com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord.class;
    }

    /**
     * The column <code>mail.external_accounts.external_account_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord, java.lang.Integer> EXTERNAL_ACCOUNT_ID = createField(org.jooq.impl.DSL.name("external_account_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mail.external_accounts.domain_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord, java.lang.String> DOMAIN_ID = createField(org.jooq.impl.DSL.name("domain_id"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>mail.external_accounts.user_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord, java.lang.String> USER_ID = createField(org.jooq.impl.DSL.name("user_id"), org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>mail.external_accounts.display_name</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord, java.lang.String> DISPLAY_NAME = createField(org.jooq.impl.DSL.name("display_name"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>mail.external_accounts.description</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord, java.lang.String> DESCRIPTION = createField(org.jooq.impl.DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>mail.external_accounts.email</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord, java.lang.String> EMAIL = createField(org.jooq.impl.DSL.name("email"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>mail.external_accounts.protocol</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord, java.lang.String> PROTOCOL = createField(org.jooq.impl.DSL.name("protocol"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>mail.external_accounts.host</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord, java.lang.String> HOST = createField(org.jooq.impl.DSL.name("host"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>mail.external_accounts.port</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord, java.lang.Integer> PORT = createField(org.jooq.impl.DSL.name("port"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>mail.external_accounts.username</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord, java.lang.String> USERNAME = createField(org.jooq.impl.DSL.name("username"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>mail.external_accounts.password</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord, java.lang.String> PASSWORD = createField(org.jooq.impl.DSL.name("password"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>mail.external_accounts.folder_prefix</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord, java.lang.String> FOLDER_PREFIX = createField(org.jooq.impl.DSL.name("folder_prefix"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>mail.external_accounts.folder_sent</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord, java.lang.String> FOLDER_SENT = createField(org.jooq.impl.DSL.name("folder_sent"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>mail.external_accounts.folder_drafts</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord, java.lang.String> FOLDER_DRAFTS = createField(org.jooq.impl.DSL.name("folder_drafts"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>mail.external_accounts.folder_trash</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord, java.lang.String> FOLDER_TRASH = createField(org.jooq.impl.DSL.name("folder_trash"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>mail.external_accounts.folder_spam</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord, java.lang.String> FOLDER_SPAM = createField(org.jooq.impl.DSL.name("folder_spam"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>mail.external_accounts.folder_archive</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord, java.lang.String> FOLDER_ARCHIVE = createField(org.jooq.impl.DSL.name("folder_archive"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>mail.external_accounts.read_only</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord, java.lang.Boolean> READ_ONLY = createField(org.jooq.impl.DSL.name("read_only"), org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>mail.external_accounts.provider_id</code>.
     */
    public final org.jooq.TableField<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord, java.lang.String> PROVIDER_ID = createField(org.jooq.impl.DSL.name("provider_id"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    private ExternalAccounts(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ExternalAccounts(org.jooq.Name alias, org.jooq.Table<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, null, aliased, parameters, org.jooq.impl.DSL.comment(""), org.jooq.TableOptions.table());
    }

    /**
     * Create an aliased <code>mail.external_accounts</code> table reference
     */
    public ExternalAccounts(java.lang.String alias) {
        this(org.jooq.impl.DSL.name(alias), EXTERNAL_ACCOUNTS);
    }

    /**
     * Create an aliased <code>mail.external_accounts</code> table reference
     */
    public ExternalAccounts(org.jooq.Name alias) {
        this(alias, EXTERNAL_ACCOUNTS);
    }

    /**
     * Create a <code>mail.external_accounts</code> table reference
     */
    public ExternalAccounts() {
        this(org.jooq.impl.DSL.name("external_accounts"), null);
    }

    public <O extends org.jooq.Record> ExternalAccounts(org.jooq.Table<O> child, org.jooq.ForeignKey<O, com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord> key) {
        super(child, key, EXTERNAL_ACCOUNTS);
    }

    @java.lang.Override
    public org.jooq.Schema getSchema() {
        return com.sonicle.webtop.mail.jooq.Mail.MAIL;
    }

    @java.lang.Override
    public org.jooq.UniqueKey<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord> getPrimaryKey() {
        return com.sonicle.webtop.mail.jooq.Keys.EXTERNAL_ACCOUNTS_PKEY;
    }

    @java.lang.Override
    public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord>>asList(com.sonicle.webtop.mail.jooq.Keys.EXTERNAL_ACCOUNTS_PKEY);
    }

    @java.lang.Override
    public ExternalAccounts as(java.lang.String alias) {
        return new ExternalAccounts(org.jooq.impl.DSL.name(alias), this);
    }

    @java.lang.Override
    public ExternalAccounts as(org.jooq.Name alias) {
        return new ExternalAccounts(alias, this);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public ExternalAccounts rename(java.lang.String name) {
        return new ExternalAccounts(org.jooq.impl.DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @java.lang.Override
    public ExternalAccounts rename(org.jooq.Name name) {
        return new ExternalAccounts(name, null);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @java.lang.Override
    public org.jooq.Row19<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String> fieldsRow() {
        return (org.jooq.Row19) super.fieldsRow();
    }
}
