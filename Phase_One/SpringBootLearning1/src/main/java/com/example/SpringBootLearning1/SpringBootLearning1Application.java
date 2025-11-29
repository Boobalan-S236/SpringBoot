package com.example.SpringBootLearning1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootLearning1Application {
    //one object
    //FIELD INJECTION

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringBootLearning1Application.class, args);
	    Student s1 = (Student) context.getBean("s1");
        s1.writingexam();
    }

}
