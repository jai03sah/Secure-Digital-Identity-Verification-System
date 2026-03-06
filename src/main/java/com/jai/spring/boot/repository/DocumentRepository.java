package com.jai.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jai.spring.boot.model.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}