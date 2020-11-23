package com.rafi.LearnSpring;

import org.springframework.stereotype.Component;

@Component
public class MyImplements implements MyServices{
    @Override
    public void sayHello1() {
        System.out.println("Hello, world!");
    }

    public void sayHello2() {
        System.out.println("Hello, WORLD!");
    }
}