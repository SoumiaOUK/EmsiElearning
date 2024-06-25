package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.demo.Entities.StudentResponse;
import com.example.demo.Repositories.StudentResponseRepository;

@Service
public class StudentResponseServiceImpl implements StudentResponseService {

    @Autowired
    private StudentResponseRepository studentResponseRepository;

    @Override
    public StudentResponse SaveStudentResponse(StudentResponse studentResponse) {
        return studentResponseRepository.save(studentResponse);
    }

    @Override
    public StudentResponse GetStudentResponseById(long id) {
        return studentResponseRepository.findById(id).orElse(null);
    }

    @Override
    public StudentResponse updateStudentResponse(StudentResponse studentResponse) {
        return studentResponseRepository.save(studentResponse);
    }

    @Override
    public void deleteStudentResponseById(long id) {
        studentResponseRepository.deleteById(id);
    }

    @Override
    public void deleteAllStudentResponse() {
        studentResponseRepository.deleteAll();
    }

    @Override
    public List<StudentResponse> getAllStudentResponse() {
        return studentResponseRepository.findAll();
    }
}