package com.example.SpringBootLearning3SettorMultipleBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("s1")
public class Student {
    private Pen pen;

    public Pen getPen() {
        return pen;
    }

    @Autowired
    @Qualifier("p2")
    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void we(){
        pen.write();
    }
}
