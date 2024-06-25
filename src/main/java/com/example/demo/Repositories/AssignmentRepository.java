package com.example.demo.Repositories;

import com.example.demo.Entities.Assignment;
import com.example.demo.Entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
}
