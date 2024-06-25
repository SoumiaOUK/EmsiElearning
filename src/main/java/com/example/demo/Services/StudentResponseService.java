package com.example.demo.Services;

import com.example.demo.Entities.StudentResponse;

import java.util.List;

public interface StudentResponseService {
    StudentResponse SaveStudentResponse(StudentResponse StudentResponse);
    StudentResponse GetStudentResponseById(long id);
    StudentResponse updateStudentResponse(StudentResponse StudentResponse);
    void deleteStudentResponseById(long id);
    void deleteAllStudentResponse();
    List<StudentResponse> getAllStudentResponse();
}
