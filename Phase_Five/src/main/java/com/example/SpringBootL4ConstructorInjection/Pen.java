package com.example.SpringBootL4ConstructorInjection;

import org.springframework.stereotype.Component;

@Component("p1")
public class Pen {
    public void write(){
    System.out.println("Writing useng pen...");
    }
}
