package com.xss.design_patterns_demo.proxy;

/**
 * @Title: RealSubjectImpl
 * @Description: 真实主题
 * @author: TC20014
 * @date: 2019/7/26 16:42
 * @Version: 1.0
 */
public class RealSubjectImpl implements ISubject {

    @Override
    public void subjectName(String name) {
        System.out.println(name);
    }

    @Override
    public void subjectAction(String text) {
        System.out.println(text);
    }

    @Override
    public void subjectActionEnd(String text) {
        System.out.println(text);
    }
}
