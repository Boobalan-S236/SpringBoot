package com.example.FirstSpringBoot;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("s1")
@Scope("singleton")
public class Student {

    int age;

    Student(){
        System.out.println("From student constructor......" );

    }
    public void show(){
        System.out.println("FROM STUDENT........");
    }
}
