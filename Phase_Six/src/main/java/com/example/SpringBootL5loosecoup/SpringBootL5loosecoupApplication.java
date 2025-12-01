package com.example.SpringBootL5loosecoup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootL5loosecoupApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringBootL5loosecoupApplication.class, args);
        Student s1 = (Student) context.getBean("s1");
        s1.writeexam();
    }

}
