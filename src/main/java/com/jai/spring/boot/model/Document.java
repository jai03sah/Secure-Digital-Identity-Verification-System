package com.jai.spring.boot.model;

import jakarta.persistence.*;

@Entity
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String documentType;
    private String documentNumber;
    private String status;   // PENDING / VERIFIED

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Document(){} 

    public Document(String documentType, String documentNumber, String status, User user) {
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.status = status;
        this.user = user;
    }

    // Getters & Setters
    public Long getId() { return id; }

    public String getDocumentType() { return documentType; }
    public void setDocumentType(String documentType) { this.documentType = documentType; }

    public String getDocumentNumber() { return documentNumber; }
    public void setDocumentNumber(String documentNumber) { this.documentNumber = documentNumber; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}