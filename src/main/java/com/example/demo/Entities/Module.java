package com.example.demo.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany
    private List<Course> courses;
    // getters and setters
}