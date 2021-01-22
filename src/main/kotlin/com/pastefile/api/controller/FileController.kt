package com.pastefile.api.controller

import com.pastefile.api.dto.FileCreationResponseDto
import com.pastefile.application.entity.FileCreationRequest
import com.pastefile.application.service.FileService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.io.Resource
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile

/**
 * created by @ddd127 (demintsievd@yandex.ru) on 21.01.2021
 */

@Controller
class FileController @Autowired constructor(
    private val fileService: FileService
) {

    private val radix = 16

    @GetMapping("/")
    fun mainPage() = "main_page"

    @PostMapping("/")
    @ResponseBody
    fun createFile(
        @RequestParam("file") multipartFile: MultipartFile
    ): FileCreationResponseDto {
        val id = fileService.createFile(fileCreationRequest(multipartFile))
        return FileCreationResponseDto("f/" + id.toString(radix))
    }

    @GetMapping("/f/{hexId}")
    fun getFile(@PathVariable hexId: String, model: Model): String {
        val fileInfo = fileService.getFileInfo(hexId.toLong(radix))
        if (fileInfo != null) {
            model.addAttribute("p_text", "File found")
            model.addAttribute(
                "link_text",
                "Download ${if (fileInfo.name.length > 15) fileInfo.name.substring(0, 12) + "..." else fileInfo.name}"
            )
            model.addAttribute("link", "/file/$hexId")
        } else {
            model.addAttribute("p_text", "File not found")
            model.addAttribute("link_text", "Go to main page")
            model.addAttribute("link", "/")
        }
        return "file_page"
    }

    @GetMapping("/file/{hexId}")
    @ResponseBody
    fun getFileAsResource(
        @PathVariable hexId: String
    ): ResponseEntity<Resource> {
        val id = hexId.toLong(radix)
        val file = fileService.getById(id)!!
        return ResponseEntity.ok()
            .contentType(MediaType.parseMediaType(file.fileInfo.mediaType))
            .header(
                HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\"" + file.fileInfo.name
            )
            .body(file.resource)
    }

    private fun fileCreationRequest(
        file: MultipartFile
    ) = FileCreationRequest(
        file.originalFilename!!,
        file.contentType!!,
        file
    )
}
