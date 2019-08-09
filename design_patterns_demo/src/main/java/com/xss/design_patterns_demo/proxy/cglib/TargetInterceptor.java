package com.xss.design_patterns_demo.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Title: TargetInterceptor
 * @Description: 目标对象拦截器
 * @author: TC20014
 * @date: 2019/8/1 16:45
 * @Version: 1.0
 */
public class TargetInterceptor implements MethodInterceptor {
    /**
     * 重写方法拦截在方法前和方法后加入业务
     * @param obj 目标对象
     * @param method 目标方法
     * @param params 参数
     * @param proxy CGlib方法代理对象
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj
            , Method method
            , Object[] params
            , MethodProxy proxy) throws Throwable {
        System.out.println("调用前");
        Object result = proxy.invokeSuper(obj, params);
        System.out.println("调用后");
        return result;
    }
}
