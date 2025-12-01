package com.example.scopeObjectProvider.Service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("es")
@Scope("request")
public class EmployeeService {

    EmployeeService(){
        System.out.println(this);
    }
    public String greet() {
        return "hi welcome..."+this;
    }
}
