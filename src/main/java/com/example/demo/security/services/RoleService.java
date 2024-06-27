package com.example.demo.security.services;

import com.example.demo.security.entities.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {
    public List<Role> getRoles();
    Role saveRole(Role r);

}
