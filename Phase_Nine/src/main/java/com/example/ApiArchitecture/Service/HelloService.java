package com.example.ApiArchitecture.Service;

import org.springframework.stereotype.Service;

@Service("s1")
public class HelloService {

    public String greetingService(){
        return "WELCOME TO OUR WEBSTE !!!!";
    }

    public String about(){
        return "ABOUT PAGE ......";
    }
}
