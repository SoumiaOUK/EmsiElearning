package com.example.demo.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cne;
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudentResponse> studentResponses;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    // getters and setters
    @ManyToOne
    @JoinColumn(name="groupe_id")
    private Groupe groupe;}