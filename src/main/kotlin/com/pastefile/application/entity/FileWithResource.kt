package com.pastefile.application.entity

import com.pastefile.domain.model.FileInfo
import org.springframework.core.io.FileSystemResource

/**
 * created by @ddd127 (demintsievd@yandex.ru) on 21.01.2021
 */

data class FileWithResource(
    val fileInfo: FileInfo,
    val resource: FileSystemResource
)
