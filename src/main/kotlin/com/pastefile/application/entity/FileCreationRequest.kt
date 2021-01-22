package com.pastefile.application.entity

import org.springframework.web.multipart.MultipartFile

/**
 * created by @ddd127 (demintsievd@yandex.ru) on 21.01.2021
 */

data class FileCreationRequest(
    val name: String,
    val mediaType: String,
    val multipartFile: MultipartFile
)
