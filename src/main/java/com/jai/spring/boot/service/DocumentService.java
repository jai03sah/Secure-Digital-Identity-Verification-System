package com.jai.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jai.spring.boot.repository.DocumentRepository;

@Service
public class DocumentService {

    @Autowired
    private DocumentRepository documentRepository;
    public String uploadDocument(Document document){
        document.setStatus("PENDING");
        documentRepository.save(document);
        return "Document Uploaded";
    }
    
    public List<Document> getAllDocuments() {
        return documentRepository.findAll();
    }
}
