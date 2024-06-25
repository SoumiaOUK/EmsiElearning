package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeacherController {
    @RequestMapping("/listStudents")
    public String listStudents(){
        return "Teacher/ListStudents";
    }
    @RequestMapping("/listCourses")
    public String listCourses(){
        return "Teacher/ListCourses";
    }
    @RequestMapping("/listAssignements")
    public String listAssignements(){
        return "Teacher/ListAssignements";
    }
    @RequestMapping("/addCourse")
    public String addCourse(){
        return "Teacher/AddCourse";
    }
    @RequestMapping("/addAssignement")
    public String addAssignement(){
        return "Teacher/AddAssignement";
    }


}
