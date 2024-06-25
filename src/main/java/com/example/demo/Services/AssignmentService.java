package com.example.demo.Services;


import com.example.demo.Entities.Assignment;

import java.util.List;

public interface AssignmentService {
    Assignment SaveAssignment(Assignment assignment);
    Assignment GetAssignmentById(long id);
    Assignment updateAssignment(Assignment assignment);
    void deleteAssignmentById(long id);
    void deleteAllAssignment();
    List<Assignment> getAllAssignment();
}
