package com.example.SpringBootL4ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("s1")
public class Student {
    private Pen pen;

    @Autowired
    public Student(@Qualifier("p1") Pen pen) {
        this.pen = pen;
    }

    public void write(){
        pen.write();
    }
}
