package com.example.SpringBootLearning3SettorMultipleBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean("p1")
    public Pen pen1(){
        return new Pen();
    }
    @Bean("p2")
    public Pen pen2(){
        return new Pen();
    }

}
