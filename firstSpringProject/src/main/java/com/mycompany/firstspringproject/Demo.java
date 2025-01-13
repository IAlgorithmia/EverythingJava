package com.mycompany.firstspringproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @RequestMapping("/")
    public String greet() {
        return "Hello, World! Welcome to Spring Boot!";
    }
}
