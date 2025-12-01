package com.example.SpringBootL5loosecoup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("s1")

public class Student {

    @Autowired
    @Qualifier("p1")
    private Writer w;

    public void writeexam(){
        w.write();
    }

}
