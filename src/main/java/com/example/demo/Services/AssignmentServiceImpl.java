package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.demo.Entities.Assignment;
import com.example.demo.Repositories.AssignmentRepository;

@Service
public class AssignmentServiceImpl implements AssignmentService {

    @Autowired
    private AssignmentRepository assignmentRepository;

    @Override
    public Assignment SaveAssignment(Assignment assignment) {
        return assignmentRepository.save(assignment);
    }

    @Override
    public Assignment GetAssignmentById(long id) {
        return assignmentRepository.findById(id).orElse(null);
    }

    @Override
    public Assignment updateAssignment(Assignment assignment) {
        return assignmentRepository.save(assignment);
    }

    @Override
    public void deleteAssignmentById(long id) {
        assignmentRepository.deleteById(id);
    }

    @Override
    public void deleteAllAssignment() {
        assignmentRepository.deleteAll();
    }

    @Override
    public List<Assignment> getAllAssignment() {
        return assignmentRepository.findAll();
    }
}