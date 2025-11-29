package com.example.SpringBootLearning3Settor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootLearning3SettorApplication {

    //setter injection with single object
	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringBootLearning3SettorApplication.class, args);
        Student s1=(Student)context.getBean("s1");
        s1.writingexam();
    }

}
