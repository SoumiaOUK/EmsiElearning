package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllers {
    @RequestMapping("/Login")
    public String Login(){
        return "LoginSignUpForm";
    }

    @RequestMapping("/Signup")
    public String Signup(){
        return "LoginSignUpForm";
    }

    @RequestMapping("/HomePage")
    public String Home(){
        return "HomePage";
    }
    @RequestMapping("/ContactUs")
    public String ContactUs(){
        return "contactus";
    }
    @RequestMapping("/StudentHome")
    public String StudentHome(){
        return "StudentHome";
    }
    @RequestMapping("/ClassDetails")
    public String ClassDetails(){
        return "ClassDetailStudent";
    }
    @RequestMapping("/LessonDetails")
    public String LessonDetails(){
        return "LessonDetailStudent";
    }
    @RequestMapping("/StudentProfile")
    public String StudentProfile(){
        return "StudentProfile";
    }

}
