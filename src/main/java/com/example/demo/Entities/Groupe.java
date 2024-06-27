package com.example.demo.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Groupe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany
    private List<Student> students;
    @ManyToMany
    private List<Module>modules;
    // getters and setters
}