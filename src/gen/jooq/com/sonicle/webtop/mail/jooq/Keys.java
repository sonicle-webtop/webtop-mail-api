/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.mail.jooq;



/**
 * A class modelling foreign key relationships and constraints of tables in 
 * mail.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final org.jooq.UniqueKey<com.sonicle.webtop.mail.jooq.tables.records.AutorespondersRecord> AUTORESPONDER_PKEY = org.jooq.impl.Internal.createUniqueKey(com.sonicle.webtop.mail.jooq.tables.Autoresponders.AUTORESPONDERS, org.jooq.impl.DSL.name("autoresponder_pkey"), new org.jooq.TableField[] { com.sonicle.webtop.mail.jooq.tables.Autoresponders.AUTORESPONDERS.DOMAIN_ID, com.sonicle.webtop.mail.jooq.tables.Autoresponders.AUTORESPONDERS.USER_ID }, true);
    public static final org.jooq.UniqueKey<com.sonicle.webtop.mail.jooq.tables.records.ExternalAccountsRecord> EXTERNAL_ACCOUNTS_PKEY = org.jooq.impl.Internal.createUniqueKey(com.sonicle.webtop.mail.jooq.tables.ExternalAccounts.EXTERNAL_ACCOUNTS, org.jooq.impl.DSL.name("external_accounts_pkey"), new org.jooq.TableField[] { com.sonicle.webtop.mail.jooq.tables.ExternalAccounts.EXTERNAL_ACCOUNTS.EXTERNAL_ACCOUNT_ID }, true);
    public static final org.jooq.UniqueKey<com.sonicle.webtop.mail.jooq.tables.records.IdentitiesRecord> IDENTITIES_PKEY1 = org.jooq.impl.Internal.createUniqueKey(com.sonicle.webtop.mail.jooq.tables.Identities.IDENTITIES, org.jooq.impl.DSL.name("identities_pkey1"), new org.jooq.TableField[] { com.sonicle.webtop.mail.jooq.tables.Identities.IDENTITIES.IDENTITY_ID }, true);
    public static final org.jooq.UniqueKey<com.sonicle.webtop.mail.jooq.tables.records.InFiltersRecord> IN_FILTERS_PKEY = org.jooq.impl.Internal.createUniqueKey(com.sonicle.webtop.mail.jooq.tables.InFilters.IN_FILTERS, org.jooq.impl.DSL.name("in_filters_pkey"), new org.jooq.TableField[] { com.sonicle.webtop.mail.jooq.tables.InFilters.IN_FILTERS.IN_FILTER_ID }, true);
    public static final org.jooq.UniqueKey<com.sonicle.webtop.mail.jooq.tables.records.NotesRecord> NOTES_PKEY = org.jooq.impl.Internal.createUniqueKey(com.sonicle.webtop.mail.jooq.tables.Notes.NOTES, org.jooq.impl.DSL.name("notes_pkey"), new org.jooq.TableField[] { com.sonicle.webtop.mail.jooq.tables.Notes.NOTES.DOMAIN_ID, com.sonicle.webtop.mail.jooq.tables.Notes.NOTES.MESSAGE_ID }, true);
    public static final org.jooq.UniqueKey<com.sonicle.webtop.mail.jooq.tables.records.RulesCopyRecord> RULES_COPY_PKEY = org.jooq.impl.Internal.createUniqueKey(com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY, org.jooq.impl.DSL.name("rules_copy_pkey"), new org.jooq.TableField[] { com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY.DOMAIN_ID, com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY.USER_ID, com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY.RULE_ID }, true);
    public static final org.jooq.UniqueKey<com.sonicle.webtop.mail.jooq.tables.records.ScanRecord> MAILSCAN_PKEY = org.jooq.impl.Internal.createUniqueKey(com.sonicle.webtop.mail.jooq.tables.Scan.SCAN, org.jooq.impl.DSL.name("mailscan_pkey"), new org.jooq.TableField[] { com.sonicle.webtop.mail.jooq.tables.Scan.SCAN.DOMAIN_ID, com.sonicle.webtop.mail.jooq.tables.Scan.SCAN.USER_ID, com.sonicle.webtop.mail.jooq.tables.Scan.SCAN.FOLDERNAME }, true);
    public static final org.jooq.UniqueKey<com.sonicle.webtop.mail.jooq.tables.records.TagsRecord> TAGS_PKEY = org.jooq.impl.Internal.createUniqueKey(com.sonicle.webtop.mail.jooq.tables.Tags.TAGS, org.jooq.impl.DSL.name("tags_pkey"), new org.jooq.TableField[] { com.sonicle.webtop.mail.jooq.tables.Tags.TAGS.DOMAIN_ID, com.sonicle.webtop.mail.jooq.tables.Tags.TAGS.USER_ID, com.sonicle.webtop.mail.jooq.tables.Tags.TAGS.TAG_ID }, true);
    public static final org.jooq.UniqueKey<com.sonicle.webtop.mail.jooq.tables.records.UsersMapRecord> USERS_MAP_PKEY = org.jooq.impl.Internal.createUniqueKey(com.sonicle.webtop.mail.jooq.tables.UsersMap.USERS_MAP, org.jooq.impl.DSL.name("users_map_pkey"), new org.jooq.TableField[] { com.sonicle.webtop.mail.jooq.tables.UsersMap.USERS_MAP.DOMAIN_ID, com.sonicle.webtop.mail.jooq.tables.UsersMap.USERS_MAP.USER_ID }, true);
}
