package com.mycompany;

public class Laptop implements Computer {

    public Laptop() {
        System.out.println("Laptop object created");
    }

    public void compile(){
        System.out.println("Laptop is compiling");
    }
}
