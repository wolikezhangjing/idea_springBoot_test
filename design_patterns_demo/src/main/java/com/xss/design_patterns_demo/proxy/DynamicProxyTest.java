package com.xss.design_patterns_demo.proxy;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {

    public static void main(String[] args) {
        // 实例化真实主题
        RealSubjectImpl realSubject = new RealSubjectImpl();
        // 将真实主题交给委托类
        InvocationProxy invocationProxy = new InvocationProxy(realSubject);

        /*
         * loader：类加载器
         * interfaces：代码要用来代理的接口
         * InvocationHandler：一个实现了InvocationHandler接口的委托对象
         *
         */
        ISubject iSubject = (ISubject)Proxy.newProxyInstance(RealSubjectImpl.class.getClassLoader()
                , RealSubjectImpl.class.getInterfaces()
                , invocationProxy);
        iSubject.subjectName("DynamicProxy调试测试");
        iSubject.subjectAction("启动DynamicProxy调试");
        iSubject.subjectActionEnd("结束DynamicProxy调试");

        RealOtherSubjectImpl realOtherSubject = new RealOtherSubjectImpl();
        InvocationProxy invocationProxy1 = new InvocationProxy(realOtherSubject);
        IOtherSubject iOtherSubject = (IOtherSubject)Proxy.newProxyInstance(RealOtherSubjectImpl.class.getClassLoader()
                , RealOtherSubjectImpl.class.getInterfaces()
                , invocationProxy1);
        iOtherSubject.say("say you say me");
        System.out.println(iSubject.getClass().getName());
        System.out.println(iOtherSubject.getClass().getName());
    }
}
