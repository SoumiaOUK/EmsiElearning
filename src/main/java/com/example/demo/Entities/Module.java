package com.example.demo.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "module", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Groupe> groupes;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
    // getters and setters
}