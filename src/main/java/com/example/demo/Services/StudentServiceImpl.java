package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.demo.Entities.Student;
import com.example.demo.Repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student SaveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student GetStudentById(long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void deleteAllStudent() {
        studentRepository.deleteAll();
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}