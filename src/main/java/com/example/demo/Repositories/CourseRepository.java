package com.example.demo.Repositories;

import com.example.demo.Entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseService extends JpaRepository<Course, Long> {
}
