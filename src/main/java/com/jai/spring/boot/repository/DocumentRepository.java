package com.jai.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jai.spring.boot.model.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
    
}
