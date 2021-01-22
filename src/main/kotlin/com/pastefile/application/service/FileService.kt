package com.pastefile.application.service

import com.pastefile.application.entity.FileCreationRequest
import com.pastefile.application.entity.FileWithResource
import com.pastefile.domain.model.FileInfo
import com.pastefile.domain.repository.FileInfoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDateTime

/**
 * created by @ddd127 (demintsievd@yandex.ru) on 21.01.2021
 */

@Service
class FileService @Autowired constructor(
    private val fileInfoRepository: FileInfoRepository,
    private val fileBodyService: FileBodyService
) {

    fun createFile(fileCreationRequest: FileCreationRequest): Long {
        removeOld()

        val fileInfo = FileInfo(
            null,
            fileCreationRequest.name,
            fileCreationRequest.mediaType,
            LocalDateTime.now()
        )
        val id = fileInfoRepository.addFileInfo(fileInfo)
        fileBodyService.saveMultipartFile(
            id,
            fileInfo.name,
            fileCreationRequest.multipartFile
        )
        return id
    }

    fun getById(id: Long): FileWithResource? {
        val fileInfo = fileInfoRepository.getById(id) ?: return null
        val resource = fileBodyService.getFileResource(
            id,
            fileInfo.name
        )
        return FileWithResource(fileInfo, resource)
    }

    fun getFileInfo(id: Long): FileInfo? {
        return fileInfoRepository.getById(id)
    }

    private fun removeOld() {
        val oldList = fileInfoRepository.getOlder(
            LocalDateTime.now().minusHours(2)
        )
        oldList.forEach { fileBodyService.removeFile(it.id!!, it.name) }
        fileInfoRepository.removeAll(oldList.map { it.id!! })
    }
}
