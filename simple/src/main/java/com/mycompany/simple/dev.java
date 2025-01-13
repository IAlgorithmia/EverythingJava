package com.mycompany.simple;

import org.springframework.stereotype.Component;

@Component
public class dev {

    Laptop laptop;

    public void build() {

        laptop.compile();
        System.out.println("Working on this awesome project");
    }
}
