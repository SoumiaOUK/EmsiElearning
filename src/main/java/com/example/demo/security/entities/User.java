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
public class User {
    @Id
    private String userId;
    @Column(unique = true)
    private String username;
    private String password;
    //Each user has many roles



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prof_id")
    private Prof prof;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    private Role role;

}
