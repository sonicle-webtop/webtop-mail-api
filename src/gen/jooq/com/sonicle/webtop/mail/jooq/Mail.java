/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.mail.jooq;



/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Mail extends org.jooq.impl.SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mail</code>
     */
    public static final Mail MAIL = new Mail();

    /**
     * The table <code>mail.autoresponders</code>.
     */
    public final com.sonicle.webtop.mail.jooq.tables.Autoresponders AUTORESPONDERS = com.sonicle.webtop.mail.jooq.tables.Autoresponders.AUTORESPONDERS;

    /**
     * The table <code>mail.external_accounts</code>.
     */
    public final com.sonicle.webtop.mail.jooq.tables.ExternalAccounts EXTERNAL_ACCOUNTS = com.sonicle.webtop.mail.jooq.tables.ExternalAccounts.EXTERNAL_ACCOUNTS;

    /**
     * The table <code>mail.identities</code>.
     */
    public final com.sonicle.webtop.mail.jooq.tables.Identities IDENTITIES = com.sonicle.webtop.mail.jooq.tables.Identities.IDENTITIES;

    /**
     * The table <code>mail.in_filters</code>.
     */
    public final com.sonicle.webtop.mail.jooq.tables.InFilters IN_FILTERS = com.sonicle.webtop.mail.jooq.tables.InFilters.IN_FILTERS;

    /**
     * The table <code>mail.notes</code>.
     */
    public final com.sonicle.webtop.mail.jooq.tables.Notes NOTES = com.sonicle.webtop.mail.jooq.tables.Notes.NOTES;

    /**
     * The table <code>mail.rules_copy</code>.
     */
    public final com.sonicle.webtop.mail.jooq.tables.RulesCopy RULES_COPY = com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY;

    /**
     * The table <code>mail.scan</code>.
     */
    public final com.sonicle.webtop.mail.jooq.tables.Scan SCAN = com.sonicle.webtop.mail.jooq.tables.Scan.SCAN;

    /**
     * The table <code>mail.tags</code>.
     */
    public final com.sonicle.webtop.mail.jooq.tables.Tags TAGS = com.sonicle.webtop.mail.jooq.tables.Tags.TAGS;

    /**
     * The table <code>mail.users_map</code>.
     */
    public final com.sonicle.webtop.mail.jooq.tables.UsersMap USERS_MAP = com.sonicle.webtop.mail.jooq.tables.UsersMap.USERS_MAP;

    /**
     * No further instances allowed
     */
    private Mail() {
        super("mail", null);
    }


    @java.lang.Override
    public org.jooq.Catalog getCatalog() {
        return com.sonicle.webtop.mail.jooq.DefaultCatalog.DEFAULT_CATALOG;
    }

    @java.lang.Override
    public final java.util.List<org.jooq.Sequence<?>> getSequences() {
        return java.util.Arrays.<org.jooq.Sequence<?>>asList(
            com.sonicle.webtop.mail.jooq.Sequences.SEQ_EXTERNAL_ACCOUNTS,
            com.sonicle.webtop.mail.jooq.Sequences.SEQ_IDENTITIES,
            com.sonicle.webtop.mail.jooq.Sequences.SEQ_IN_FILTERS);
    }

    @java.lang.Override
    public final java.util.List<org.jooq.Table<?>> getTables() {
        return java.util.Arrays.<org.jooq.Table<?>>asList(
            com.sonicle.webtop.mail.jooq.tables.Autoresponders.AUTORESPONDERS,
            com.sonicle.webtop.mail.jooq.tables.ExternalAccounts.EXTERNAL_ACCOUNTS,
            com.sonicle.webtop.mail.jooq.tables.Identities.IDENTITIES,
            com.sonicle.webtop.mail.jooq.tables.InFilters.IN_FILTERS,
            com.sonicle.webtop.mail.jooq.tables.Notes.NOTES,
            com.sonicle.webtop.mail.jooq.tables.RulesCopy.RULES_COPY,
            com.sonicle.webtop.mail.jooq.tables.Scan.SCAN,
            com.sonicle.webtop.mail.jooq.tables.Tags.TAGS,
            com.sonicle.webtop.mail.jooq.tables.UsersMap.USERS_MAP);
    }
}