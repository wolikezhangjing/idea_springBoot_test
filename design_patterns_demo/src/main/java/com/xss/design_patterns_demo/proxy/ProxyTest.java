package com.xss.design_patterns_demo.proxy;

/**
 * @Title: ProxyTest
 * @Description: 代理模式测试
 * @author: TC20014
 * @date: 2019/7/26 16:46
 * @Version: 1.0
 */
public class ProxyTest {

    public static void main(String[] args) {
        simpleProxy();
    }

    public static void simpleProxy(){
        RealSubjectImpl realSubject = new RealSubjectImpl();
        SubjectProxy proxy = new SubjectProxy(realSubject);
        proxy.subjectName("代理名称：realSubject");
        proxy.subjectAction("开始代理操作……");
        proxy.subjectActionEnd("结束代理操作");
    }
}
