/*
 * This file is generated by jOOQ.
 */
package com.pastefile.domain.db.tables.records;


import com.pastefile.domain.db.tables.Files;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilesRecord extends UpdatableRecordImpl<FilesRecord> implements Record6<Long, LocalDateTime, String, String, String, String> {

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
     * Setter for <code>public.files.code</code>.
     */
    public void setCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.files.code</code>.
     */
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.files.path</code>.
     */
    public void setPath(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.files.path</code>.
     */
    public String getPath() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.files.name</code>.
     */
    public void setName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.files.name</code>.
     */
    public String getName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.files.media_type</code>.
     */
    public void setMediaType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.files.media_type</code>.
     */
    public String getMediaType() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, LocalDateTime, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, LocalDateTime, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
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
        return Files.FILES.CODE;
    }

    @Override
    public Field<String> field4() {
        return Files.FILES.PATH;
    }

    @Override
    public Field<String> field5() {
        return Files.FILES.NAME;
    }

    @Override
    public Field<String> field6() {
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
        return getCode();
    }

    @Override
    public String component4() {
        return getPath();
    }

    @Override
    public String component5() {
        return getName();
    }

    @Override
    public String component6() {
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
        return getCode();
    }

    @Override
    public String value4() {
        return getPath();
    }

    @Override
    public String value5() {
        return getName();
    }

    @Override
    public String value6() {
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
        setCode(value);
        return this;
    }

    @Override
    public FilesRecord value4(String value) {
        setPath(value);
        return this;
    }

    @Override
    public FilesRecord value5(String value) {
        setName(value);
        return this;
    }

    @Override
    public FilesRecord value6(String value) {
        setMediaType(value);
        return this;
    }

    @Override
    public FilesRecord values(Long value1, LocalDateTime value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
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
    public FilesRecord(Long id, LocalDateTime time, String code, String path, String name, String mediaType) {
        super(Files.FILES);

        setId(id);
        setTime(time);
        setCode(code);
        setPath(path);
        setName(name);
        setMediaType(mediaType);
    }
}