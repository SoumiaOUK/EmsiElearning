package com.example.demo.Entities;

import com.example.demo.security.entities.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student extends User {
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudentResponse> studentResponses;

    @OneToMany
    private List<Comment> comments;

    @ManyToOne
    @JoinColumn(name = "groupe_id")
    private Groupe groupe;

    // Other fields and methods if needed
}
