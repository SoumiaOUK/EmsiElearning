package com.example.demo.Entities;

import com.example.demo.security.entities.User;
import jakarta.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private String createdAt;
    @ManyToOne
    private User user;
    // getters and setters

    @ManyToOne
    @JoinColumn(name="assignement_id")
    private Assignment assignment;
}
