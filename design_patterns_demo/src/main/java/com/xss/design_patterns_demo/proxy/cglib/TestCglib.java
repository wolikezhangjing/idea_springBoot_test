package com.xss.design_patterns_demo.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @Title: TestCglib
 * @Description: 测试Cglib
 * @author: TC20014
 * @date: 2019/8/1 16:51
 * @Version: 1.0
 */
public class TestCglib {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TargetObject.class);
        enhancer.setCallback(new TargetInterceptor());
        TargetObject targetObject = (TargetObject)enhancer.create();
        System.out.println(targetObject);
        System.out.println(targetObject.executeMethod("cglib proxy executeMethod"));
        System.out.println(targetObject.executeMethod1(888));
        System.out.println(targetObject.executeMethod2(999));
    }
}
