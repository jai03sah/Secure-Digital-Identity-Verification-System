package com.jai.spring.boot.model;

import org.springframework.stereotype.Indexed;

@Entity 
public class Document {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String documentType;
    private String documentNumber;
    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
