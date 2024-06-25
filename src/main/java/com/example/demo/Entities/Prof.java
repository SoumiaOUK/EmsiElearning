package com.example.demo.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Prof {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matricule;
    @OneToOne(mappedBy = "prof")
    private User user;
    @OneToMany(mappedBy = "prof", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> comments;
    // getters and setters
}