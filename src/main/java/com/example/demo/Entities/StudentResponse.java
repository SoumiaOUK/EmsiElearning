package com.example.demo.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class StudentResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String filePath;
    private String submitDate;
    private String status;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    // getters and setters
}