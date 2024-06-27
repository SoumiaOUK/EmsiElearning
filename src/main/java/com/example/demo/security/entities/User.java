package com.example.demo.security.entities;


import com.example.demo.Entities.Prof;
import com.example.demo.Entities.Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    private String userId;
    @Column(unique = true)
    private String username;
    private String password;
    //Each user has many roles
    @ManyToOne
    private Role role;

}
