package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.demo.Entities.Course;
import com.example.demo.Repositories.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course SaveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course GetCourseById(long id) {
        return courseRepository.findById(id).orElse(null);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourseById(long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public void deleteAllCourse() {
        courseRepository.deleteAll();
    }

    @Override
    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }
}