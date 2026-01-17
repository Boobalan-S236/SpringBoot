package com.example.ConditionalOnProperty;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

    @Autowired(required = false)
    @Qualifier("s")
    StudentService studentService;

    @PostConstruct
    public void inti(){
        System.out.println("Student Service : "+ studentService);
        studentService.init();
    }

    StudentController(){
        System.out.println("Student Controller");
    }

}
