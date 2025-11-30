package com.example.SpringBootL4ConstructorInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootL4ConstructorInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(SpringBootL4ConstructorInjectionApplication.class, args);
	    Student s1 = (Student) con.getBean("s1");
        s1.write();
    }

}
