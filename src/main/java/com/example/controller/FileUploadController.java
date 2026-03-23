package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * Controller for handling file upload requests.
 * Provides endpoints to display the upload form and to process the uploaded file.
 */
@Controller
public class FileUploadController {

    /**
     * Handles GET request to display the file upload form.
     * @return the view name of the upload form
     */
    @GetMapping("/upload")
    public String uploadForm() {

        return "upload-form";
    }

    /**
     * Handles POST request to process the uploaded file.
     * Adds file information (name and size) to the model if file is not empty.
     * @param file  the uploaded MultipartFile from the form
     * @param model the Model used to pass data to the view
     * @return the view name to display the upload result
     */
    @PostMapping("/upload")
    public String handleUpload(@RequestParam("file")MultipartFile file, Model model) {

        if (!file.isEmpty()) {

            model.addAttribute("fileName", file.getOriginalFilename());
            model.addAttribute("fileSize", file.getSize());
        }

        return "upload-result";
    }
}
