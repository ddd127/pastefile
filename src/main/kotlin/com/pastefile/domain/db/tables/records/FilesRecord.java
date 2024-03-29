/*
 * This file is generated by jOOQ.
 */
package com.pastefile.domain.db.tables.records;


import com.pastefile.domain.db.tables.Files;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilesRecord extends UpdatableRecordImpl<FilesRecord> implements Record4<Long, LocalDateTime, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.files.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.files.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.files.time</code>.
     */
    public void setTime(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.files.time</code>.
     */
    public LocalDateTime getTime() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.files.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.files.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.files.media_type</code>.
     */
    public void setMediaType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.files.media_type</code>.
     */
    public String getMediaType() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, LocalDateTime, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, LocalDateTime, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Files.FILES.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return Files.FILES.TIME;
    }

    @Override
    public Field<String> field3() {
        return Files.FILES.NAME;
    }

    @Override
    public Field<String> field4() {
        return Files.FILES.MEDIA_TYPE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public LocalDateTime component2() {
        return getTime();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getMediaType();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public LocalDateTime value2() {
        return getTime();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getMediaType();
    }

    @Override
    public FilesRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public FilesRecord value2(LocalDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public FilesRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public FilesRecord value4(String value) {
        setMediaType(value);
        return this;
    }

    @Override
    public FilesRecord values(Long value1, LocalDateTime value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilesRecord
     */
    public FilesRecord() {
        super(Files.FILES);
    }

    /**
     * Create a detached, initialised FilesRecord
     */
    public FilesRecord(Long id, LocalDateTime time, String name, String mediaType) {
        super(Files.FILES);

        setId(id);
        setTime(time);
        setName(name);
        setMediaType(mediaType);
    }
}
