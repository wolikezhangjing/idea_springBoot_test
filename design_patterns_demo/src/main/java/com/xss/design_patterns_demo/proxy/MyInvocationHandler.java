package com.xss.design_patterns_demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * @Title: MyInvocationHandler
 * @Description: 动态代理的委托处理器
 * @author: TC20014
 * @date: 2019/8/1 15:54
 * @Version: 1.0
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target, args);
    }
}
