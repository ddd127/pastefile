package com.pastefile.domain.repository.impl

import com.pastefile.domain.db.tables.Files.FILES
import com.pastefile.domain.model.FileInfo
import com.pastefile.domain.repository.FileInfoRepository
import org.jooq.DSLContext
import org.jooq.Record
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import java.time.LocalDateTime

/**
 * created by @ddd127 (demintsievd@yandex.ru) on 21.01.2021
 */

@Repository("fileInfoRepository")
class FileInfoRepositoryImpl @Autowired constructor(
    private val dslContext: DSLContext
) : FileInfoRepository {

    override fun addFileInfo(fileInfo: FileInfo): Long =
        dslContext.insertInto(FILES)
            .set(FILES.NAME, fileInfo.name)
            .set(FILES.MEDIA_TYPE, fileInfo.mediaType)
            .set(FILES.TIME, fileInfo.createdTime)
            .returning(FILES.ID)
            .fetchOne()
            ?.id!!

    override fun getById(id: Long): FileInfo? =
        dslContext.selectFrom(FILES)
            .where(FILES.ID.eq(id))
            .fetchOne(this::convertToFileInfo)

    override fun checkById(id: Long): Boolean =
        dslContext.selectFrom(FILES)
            .where(FILES.ID.eq(id))
            .fetchOne() != null

    override fun getOlder(dateTime: LocalDateTime): List<FileInfo> =
        dslContext.selectFrom(FILES)
            .where(FILES.TIME.lt(dateTime))
            .fetch(this::convertToFileInfo)

    override fun removeAll(idList: List<Long>) {
        dslContext.deleteFrom(FILES)
            .where(FILES.ID.`in`(idList))
            .execute()
    }

    private fun convertToFileInfo(record: Record): FileInfo =
        FileInfo(
            record.get(FILES.ID),
            record.get(FILES.NAME),
            record.get(FILES.MEDIA_TYPE),
            record.get(FILES.TIME),
        )
}
