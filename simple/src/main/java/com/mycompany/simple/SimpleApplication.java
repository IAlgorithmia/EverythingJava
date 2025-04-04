package com.mycompany.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SimpleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SimpleApplication.class, args);

        dev obj = context.getBean(dev.class);

        obj.build();
    }

}
