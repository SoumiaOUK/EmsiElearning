package com.example.demo.Controllers;

import com.example.demo.Entities.Assignment;
import com.example.demo.Entities.Course;
import com.example.demo.Entities.Student;
import com.example.demo.Services.AssignmentService;
import com.example.demo.Services.CourseService;
import com.example.demo.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TeacherController {
    @Autowired
    StudentService studentService;
    @Autowired
    CourseService courseService;
    @Autowired
    AssignmentService assignmentService;
    @RequestMapping("/listStudents")
    public String listStudents(ModelMap model){
        List<Student> students = studentService.getAllStudent();
        model.addAttribute("students",students);
        return "Teacher/ListStudents";
    }
    @RequestMapping("/listCourses")
    public String listCourses(ModelMap model){
        List<Course> courses = courseService.getAllCourse();
        model.addAttribute("courses",courses);
        return "Teacher/ListCourses";
    }
    @RequestMapping("/listAssignments")
    public String listAssignments(ModelMap model){

        List<Assignment> assignments = assignmentService.getAllAssignment();
        model.addAttribute("assignments",assignments);
        return "Teacher/ListAssignments";
    }
    @RequestMapping("/addCourse")
    public String addCourse(){
        return "Teacher/AddCourse";
    }
    @RequestMapping("/saveCourse")
    public String saveCourse(@ModelAttribute("leaveType")Course course, BindingResult bR, ModelMap modelMap){
        if (bR.hasErrors()) {
            // If there are validation errors, add an error message to the model
            modelMap.addAttribute("errorMessage", "Please fix the validation errors and submit again.");
            return "createLeaveType"; // Return to the form with the error message
        }
        courseService.SaveCourse(course);
        return "redirect : /listCourses";
    }
    @RequestMapping("/addAssignement")
    public String addAssignement(){
        return "Teacher/AddAssignement";
    }
    @RequestMapping("/saveAssignment")
    public String saveAssignment(@ModelAttribute("leaveType")Assignment assignment, BindingResult bR, ModelMap modelMap){
        if (bR.hasErrors()) {
            // If there are validation errors, add an error message to the model
            modelMap.addAttribute("errorMessage", "Please fix the validation errors and submit again.");
            return "createLeaveType"; // Return to the form with the error message
        }
        assignmentService.SaveAssignment(assignment);
        return "redirect : /listCourses";
    }


}
