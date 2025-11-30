package com.example.SpringBootLearning3SettorMultipleBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootLearning3SettorMultipleBeanApplication {

    // for multiple bean settor injection simple
	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringBootLearning3SettorMultipleBeanApplication.class, args);
        Student s1 = (Student) context.getBean("s1");
        s1.we();
    }

}
