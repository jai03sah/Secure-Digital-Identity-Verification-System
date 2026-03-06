package com.jai.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jai.spring.boot.model.Document;
import com.jai.spring.boot.service.DocumentService;

@RestController
@RequestMapping("/documents")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @PostMapping("/upload")
    public String upload(@RequestBody Document document){
        return documentService.uploadDocument(document);
    }

    @GetMapping("/all")
    public List<Document> all(){
        return documentService.getAllDocuments();
    }
}