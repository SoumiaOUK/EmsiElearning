package com.example.demo.Entities;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.util.Date;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private String createdAt;
    @ManyToOne
    @JoinColumn(name = "prof_id")
    private Prof prof;
    // getters and setters

    @ManyToOne
    @JoinColumn(name="assignement_id")
    private Assignment assignment;
}
