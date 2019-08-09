package com.xss.design_patterns_demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Title: InvocationProxy
 * @Description: 动态代理类
 * @author: TC20014
 * @date: 2019/8/1 14:02
 * @Version: 1.0
 */
public class InvocationProxy implements InvocationHandler {

    private Object target;

    /**
     * 有参构造函数
     * @param target
     */
    public InvocationProxy(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy 代理对象
     * @param method 代理对象调用的方法
     * @param args 调用的方法中的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println( "simpleName is " + this.getClass().getSimpleName());
        return method.invoke(this.target, args);
    }
}
