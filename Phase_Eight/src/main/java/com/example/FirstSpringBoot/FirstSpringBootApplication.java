package com.example.FirstSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

@SpringBootApplication

public class FirstSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(FirstSpringBootApplication.class, args);
	    Student s1 = (Student)context.getBean("s1");
        s1.age=20;
        s1.show();

        Student s2=(Student) context.getBean("s1");
        s2.age=10;
        s1.show();

        System.out.println(s1.age+" : "+s2.age);
    }

}
