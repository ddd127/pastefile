package com.pastefile.standalone

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class PastefileApplication

fun main(args: Array<String>) {
    runApplication<PastefileApplication>(*args)
}
