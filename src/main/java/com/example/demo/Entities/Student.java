package com.example.demo.Entities;

import com.example.demo.security.entities.User;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String cne;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudentResponse> studentResponses;

    @ManyToOne
    @JoinColumn(name = "groupe_id")
    private Groupe groupe;
    // getters and setters

    @OneToOne(fetch = FetchType.EAGER,mappedBy = "student")
    private User user;
}
