package com.mycompany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext dev = new ClassPathXmlApplicationContext("spring.xml");
        Dev obj = (Dev) dev.getBean("dev");
        obj.build();
    }
}
