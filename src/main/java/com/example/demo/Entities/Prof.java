package com.example.demo.Entities;

import com.example.demo.security.entities.User;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prof extends User{

    @OneToMany
    private List<Comment> comments;
    // getters and setters

}
