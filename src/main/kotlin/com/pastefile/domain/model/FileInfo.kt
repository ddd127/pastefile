package com.pastefile.domain.model

import java.time.LocalDateTime

/**
 * created by @ddd127 (demintsievd@yandex.ru) on 21.01.2021
 */

data class FileInfo(
    val id: Long?,
    val name: String,
    val mediaType: String,
    val createdTime: LocalDateTime
)
