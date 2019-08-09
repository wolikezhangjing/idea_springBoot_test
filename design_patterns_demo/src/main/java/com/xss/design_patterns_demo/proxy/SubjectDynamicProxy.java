package com.xss.design_patterns_demo.proxy;

import java.lang.reflect.InvocationHandler;

/**
 * @Title: SubjectDynamicProxy
 * @Description: 封装动态代理委托类
 * @author: TC20014
 * @date: 2019/8/1 16:25
 * @Version: 1.0
 */
public class SubjectDynamicProxy extends DynamicProxy {

    public static <T> T newProxyInstance(IPhoneSubject subject){
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        InvocationHandler invocationHandler = new MyInvocationHandler(subject);
        return newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}
