package com.example.demo.Repositories;

import com.example.demo.Entities.StudentResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentResponseRepository extends JpaRepository<StudentResponse, Long> {
}
