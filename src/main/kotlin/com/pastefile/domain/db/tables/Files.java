/*
 * This file is generated by jOOQ.
 */
package com.pastefile.domain.db.tables;


import com.pastefile.domain.db.Indexes;
import com.pastefile.domain.db.Keys;
import com.pastefile.domain.db.Public;
import com.pastefile.domain.db.tables.records.FilesRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Files extends TableImpl<FilesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.files</code>
     */
    public static final Files FILES = new Files();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilesRecord> getRecordType() {
        return FilesRecord.class;
    }

    /**
     * The column <code>public.files.id</code>.
     */
    public final TableField<FilesRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.files.time</code>.
     */
    public final TableField<FilesRecord, LocalDateTime> TIME = createField(DSL.name("time"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.files.name</code>.
     */
    public final TableField<FilesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.files.media_type</code>.
     */
    public final TableField<FilesRecord, String> MEDIA_TYPE = createField(DSL.name("media_type"), SQLDataType.VARCHAR(255), this, "");

    private Files(Name alias, Table<FilesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Files(Name alias, Table<FilesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.files</code> table reference
     */
    public Files(String alias) {
        this(DSL.name(alias), FILES);
    }

    /**
     * Create an aliased <code>public.files</code> table reference
     */
    public Files(Name alias) {
        this(alias, FILES);
    }

    /**
     * Create a <code>public.files</code> table reference
     */
    public Files() {
        this(DSL.name("files"), null);
    }

    public <O extends Record> Files(Table<O> child, ForeignKey<O, FilesRecord> key) {
        super(child, key, FILES);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FILES_ID_U_INDEX);
    }

    @Override
    public Identity<FilesRecord, Long> getIdentity() {
        return (Identity<FilesRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<FilesRecord> getPrimaryKey() {
        return Keys.FILES_PKEY;
    }

    @Override
    public List<UniqueKey<FilesRecord>> getKeys() {
        return Arrays.<UniqueKey<FilesRecord>>asList(Keys.FILES_PKEY);
    }

    @Override
    public Files as(String alias) {
        return new Files(DSL.name(alias), this);
    }

    @Override
    public Files as(Name alias) {
        return new Files(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Files rename(String name) {
        return new Files(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Files rename(Name name) {
        return new Files(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, LocalDateTime, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
