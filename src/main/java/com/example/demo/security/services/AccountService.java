package com.example.demo.security.services;

import com.example.demo.Entities.Prof;
import com.example.demo.Entities.Student;
import com.example.demo.security.entities.Role;
import com.example.demo.security.entities.User;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {
    /*
    //User createUser(String username, String password, String confirmPassword);

    void removeRoleFromUser(String username, String role);

    String usernameGenerator(String firstName,String lastName);

    String generateRandomPassword();

    //void sendPasswordByEmail(String password,String mail);

     */
    User createUserProf(Prof person);
    User createUserStudent(Student person);

    void addRoleToUser(String username, Role role);
    Role listRole(User user);
    Role createRole(String role);
    User loadUserByUsername(String username);
}
