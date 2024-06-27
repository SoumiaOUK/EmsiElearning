package com.example.demo.Entities;

import jakarta.persistence.*;

@Entity
public class StudentResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String filePath;
    private String submitDate;
    private String status;
    @ManyToOne
    @JoinColumn
    private Student student;
    // getters and setters
}