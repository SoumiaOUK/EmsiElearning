package com.example.demo.security.services;

import com.example.demo.Entities.Prof;
import com.example.demo.Entities.Student;
import com.example.demo.security.entities.Role;

import com.example.demo.security.entities.User;
import com.example.demo.security.repositories.RoleRepository;
import com.example.demo.security.repositories.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional
public class AccountServiceImp implements AccountService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;
    @Autowired
    RoleServiceImp roleServiceImp;

    @Override
    public User loadUserByUsername(String username) {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            System.out.println("username not found");
            throw new UsernameNotFoundException(username);
        }
        return user;
    }

    @Override
    public User createUserProf(Prof p) {
        userRepository.save(new User(p.getUserId(),p.getUsername(),"111",roleRepository.getReferenceById("PROFESSOR")));
        return null;
    }
    @Override
    public User createUserStudent(Student p) {
        userRepository.save(new User(p.getUserId(),p.getUsername(),"111",roleRepository.getReferenceById("STUDENT")));
        return null;
    }

    @Override
    public void addRoleToUser(String username, Role role) {
        userRepository.findByUsername(username).setRole(role);
    }

    public Role listRole(User user){
        return user.getRole();
    }

    @Override
    public Role createRole(String role) {
        return roleRepository.save(new Role(role));
    }


}
