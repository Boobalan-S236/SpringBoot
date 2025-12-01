package com.example.scopeObjectProvider.Controller;

import com.example.scopeObjectProvider.Service.EmployeeService;
import com.example.scopeObjectProvider.Service.SingletonService;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("ec")
public class EmployeeController {

    @Autowired
    @Qualifier("single")
    SingletonService singletonService;

    @GetMapping("/home")
    public String greet(){
        return singletonService.greet();
    }

}
