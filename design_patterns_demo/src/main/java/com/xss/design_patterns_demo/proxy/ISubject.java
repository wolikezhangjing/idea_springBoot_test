package com.xss.design_patterns_demo.proxy;

/**
 * @Title: ISubject
 * @Description: 抽象主题
 * @author: TC20014
 * @date: 2019/7/26 16:38
 * @Version: 1.0
 */
public interface ISubject {

    public void subjectName(String name);

    public void subjectAction(String text);

    public void subjectActionEnd(String text);

}
