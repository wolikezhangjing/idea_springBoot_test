package com.xss.design_patterns_demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Title: DynamicProxy
 * @Description: 动态代理泛型基类
 * @author: TC20014
 * @date: 2019/8/1 16:00
 * @Version: 1.0
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h){
        (new BeforeAdviceImpl()).executeAdvice();
        return (T)Proxy.newProxyInstance(loader, interfaces, h);
    }
}
