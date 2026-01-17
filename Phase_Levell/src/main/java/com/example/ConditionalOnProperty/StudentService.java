package com.example.ConditionalOnProperty;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service("s")
@ConditionalOnProperty(prefix = "student",value = "service",havingValue = "true",matchIfMissing = false)
public class StudentService {
    StudentService(){
        System.out.println("Student Service...");
    }

    public void init() {
        System.out.println(this);
        System.out.println(this);
    }
}
