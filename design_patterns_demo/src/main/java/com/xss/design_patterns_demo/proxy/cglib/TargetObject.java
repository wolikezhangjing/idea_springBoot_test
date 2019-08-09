package com.xss.design_patterns_demo.proxy.cglib;

public class TargetObject {

    public String executeMethod(String text){
        return text;
    }

    public Integer executeMethod1(int number){
        return number;
    }

    public Integer executeMethod2(int number){
        return number;
    }


    @Override
    public String toString() {
        return "TargetObject []" + getClass();
    }
}
