package com.pastefile.application.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.core.io.FileSystemResource
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import java.io.File

/**
 * created by @ddd127 (demintsievd@yandex.ru) on 21.01.2021
 */

@Service
class FileBodyService {

    @Value("\${upload.dir}")
    lateinit var directoryPath: String

    fun saveMultipartFile(id: Long, name: String, multipartFile: MultipartFile) {
        val file = createFile(id, name)
        multipartFile.transferTo(file)
    }

    fun getFileResource(
        id: Long,
        name: String
    ): FileSystemResource = FileSystemResource(getPath(id, name))

    fun createFile(id: Long, name: String): File {
        val currentDirectory = getDirectoryPath(id)
        File(currentDirectory).mkdirs()
        val result = File(getPath(id, name))
        result.createNewFile()
        return result
    }

    fun getPath(
        id: Long,
        name: String
    ): String = getDirectoryPath(id) + name

    fun getDirectoryPath(id: Long) = "$directoryPath$id/"
}
