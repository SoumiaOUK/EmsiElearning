package com.example.demo.Entities;

import java.util.List;

public interface StudentResponseService {
    StudentResponse SaveStudentResponse(StudentResponse StudentResponse);
    StudentResponse GetStudentResponseById(long id);
    StudentResponse updateStudentResponse(StudentResponse StudentResponse);
    void deleteStudentResponseById(long id);
    void deleteAllStudentResponse();
    List<Prof> getAllStudentResponse();
}
