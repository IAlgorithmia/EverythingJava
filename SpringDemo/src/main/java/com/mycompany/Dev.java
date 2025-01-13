package com.mycompany;

public class Dev {

    private Computer comp;

    public Dev(){
        System.out.println("Dev object created");
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void build()  {
        System.out.println("Called build method of Dev.java");
        comp.compile();
    }
}
