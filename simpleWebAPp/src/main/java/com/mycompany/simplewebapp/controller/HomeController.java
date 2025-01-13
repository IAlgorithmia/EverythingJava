package com.mycompany.simplewebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome the first Webpage";
    }

    @RequestMapping("/login")
    public String login(){
        return "Login Page";
    }
}
