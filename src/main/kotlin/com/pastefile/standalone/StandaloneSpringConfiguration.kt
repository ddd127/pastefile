package com.pastefile.standalone

import com.pastefile.api.ApiSpringConfiguration
import com.pastefile.application.ApplicationSpringConfiguration
import com.pastefile.domain.DomainSpringConfiguration
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

/**
 * created by @ddd127 (demintsievd@yandex.ru) on 21.01.2021
 */

@Configuration
@Import(value = [
    ApiSpringConfiguration::class,
    DomainSpringConfiguration::class,
    ApplicationSpringConfiguration::class
])
class StandaloneSpringConfiguration
