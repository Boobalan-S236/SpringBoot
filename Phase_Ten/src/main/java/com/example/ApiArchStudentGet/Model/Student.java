package com.example.ApiArchStudentGet.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

//for model class donot give @Component
@Data
@AllArgsConstructor
public class Student {

    Student(){}
    private int rno;
    private String name;
    private String technology;
    private int mark;

}
