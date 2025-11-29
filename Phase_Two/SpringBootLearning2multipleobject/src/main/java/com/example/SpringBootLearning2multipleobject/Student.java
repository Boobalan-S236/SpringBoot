package com.example.SpringBootLearning2multipleobject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("s1")
public class Student {

    @Autowired
    @Qualifier("p2")
    private Pen pen;
    public void writeexam(){
        pen.write();
    }
}
