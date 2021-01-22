package com.pastefile.api.dto

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * created by @ddd127 (demintsievd@yandex.ru) on 22.01.2021
 */

data class FileCreationResponseDto(@JsonProperty("url") val url: String)
