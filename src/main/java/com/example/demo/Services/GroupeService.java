package com.example.demo.Services;

import com.example.demo.Entities.Course;

import java.util.List;

public interface GroupeService {
    Course SaveCourse(Course course);
    Course GetCourseById(long id);
    Course updateCourse(Course course);
    void deleteCourseById(long id);
    void deleteAllCourse();
    List<Course> getAllCourse();
}
