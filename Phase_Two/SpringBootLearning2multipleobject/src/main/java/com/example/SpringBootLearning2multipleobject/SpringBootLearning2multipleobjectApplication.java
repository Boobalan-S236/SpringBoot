package com.example.SpringBootLearning2multipleobject;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootLearning2multipleobjectApplication {
    //field injection with multiple object
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootLearning2multipleobjectApplication.class, args);
        Student s1 = (Student)context.getBean("s1");
        s1.writeexam();
    }

}
