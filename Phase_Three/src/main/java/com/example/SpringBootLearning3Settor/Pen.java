package com.example.SpringBootLearning3Settor;

import org.springframework.stereotype.Component;

@Component("p1")
public class Pen {

    public void write(){
        System.out.println("Writing exam using pen");
    }

}
