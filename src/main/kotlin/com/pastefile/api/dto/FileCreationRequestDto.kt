package com.pastefile.api.dto

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.web.multipart.MultipartFile

/**
 * created by @ddd127 (demintsievd@yandex.ru) on 21.01.2021
 */

data class FileCreationRequestDto(
    @JsonProperty("file") val file: MultipartFile
)
