package com.example.demo.Entities;

import com.example.demo.security.entities.User;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Prof{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String matricule;

    @OneToMany(mappedBy = "prof", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> comments;
    // getters and setters


    @OneToOne(fetch = FetchType.EAGER,mappedBy = "prof")
    private User user;

}
