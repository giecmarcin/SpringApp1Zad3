package com.my.app;

/**
 * Created by mgiec on 9/5/2016.
 */
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("Spring 4" + name);
    }
}

