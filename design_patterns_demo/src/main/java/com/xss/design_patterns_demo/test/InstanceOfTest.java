package com.xss.design_patterns_demo.test;

public class InstanceOfTest {

    public static void main(String[] args) {
        //Person person = new Boy();
        Child child = new Child();
        System.out.println("======================");
        Boy boy = new Child();
        System.out.println("======================");
        Person person = new Child();

    }
}
