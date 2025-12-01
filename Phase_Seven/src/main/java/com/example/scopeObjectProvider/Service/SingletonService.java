package com.example.scopeObjectProvider.Service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("single")
public class SingletonService {

    @Autowired
    @Qualifier("es")
    ObjectProvider<EmployeeService> op;

    public String greet() {
        EmployeeService empService = op.getObject();
        return empService.greet();
    }
}
