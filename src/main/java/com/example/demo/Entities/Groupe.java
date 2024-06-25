package com.example.demo.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Groupe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "groupe", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Student> students;
    @ManyToOne
    @JoinColumn(name = "module_id")
    private Module module;
    // getters and setters
}