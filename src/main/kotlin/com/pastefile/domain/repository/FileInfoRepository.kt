package com.pastefile.domain.repository

import com.pastefile.domain.model.FileInfo

/**
 * created by @ddd127 (demintsievd@yandex.ru) on 21.01.2021
 */

interface FileInfoRepository {

    fun addFileInfo(fileInfo: FileInfo): Long

    fun getById(id: Long): FileInfo?

    fun checkById(id: Long): Boolean
}
