package com.example.demo.Repositories;

import com.example.demo.Entities.Course;
import com.example.demo.Entities.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Long> {
}
