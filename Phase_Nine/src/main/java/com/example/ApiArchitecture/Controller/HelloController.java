package com.example.ApiArchitecture.Controller;

import com.example.ApiArchitecture.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    @Qualifier("s1")
    private HelloService helloService;

    @GetMapping("/")
    public String greetingCntroller(){
       return helloService.greetingService();
    }

    @GetMapping("/about")
    public String about(){
        return helloService.about();
    }
}
