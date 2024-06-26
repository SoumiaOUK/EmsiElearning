package com.example.demo.Services;

import com.example.demo.Entities.Prof;
import com.example.demo.Entities.Student;

import java.util.List;

public interface StudentService {
    Student SaveStudent(Student student);
    Student GetStudentById(long id);
    Student updateStudent(Student Student);
    void deleteStudentById(long id);
    void deleteAllStudent();
    //get all student's by prof
    List<Student> getAllStudent();

}
