package com.example.SpringBootL5loosecoup;

import org.springframework.stereotype.Component;

@Component("pc1")

public class Pencil implements Writer{

    @Override
    public void write() {
        System.out.println("using by pencil");
    }
}
