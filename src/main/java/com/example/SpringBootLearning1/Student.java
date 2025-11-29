package com.example.SpringBootLearning1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("s1")
public class Student {

    @Autowired
    private Pen pen;

    public void show(){
        System.out.println("SHOW METHOD CALLED.....");
    }
    public  void writingexam(){
        pen.write();
    }
}
