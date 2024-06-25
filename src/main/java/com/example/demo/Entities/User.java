package com.example.demo.Entities;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String username;
    @OneToOne(mappedBy = "user")
    private Student student;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="prof_id")
    private Prof prof;
    // getters and setters
}