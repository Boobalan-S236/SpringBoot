package com.example.SpringBootL5loosecoup;

import org.springframework.stereotype.Component;

@Component("p1")

public class Pen implements Writer{

    @Override
    public void write() {
        System.out.println("using by pen");
    }
}
