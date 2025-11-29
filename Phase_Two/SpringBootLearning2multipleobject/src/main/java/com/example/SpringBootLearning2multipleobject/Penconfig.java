package com.example.SpringBootLearning2multipleobject;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Penconfig {

    @Bean("p1")
    public Pen pen1(){
        return new Pen();
    }

    @Bean("p2")
    public Pen pen2(){
        return new Pen();
    }

}
