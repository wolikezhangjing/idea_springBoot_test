package com.xss.design_patterns_demo.proxy;

/**
 * @Title: RealOtherSubjectImpl
 * @Description: 其他主题实现
 * @author: TC20014
 * @date: 2019/8/1 15:16
 * @Version: 1.0
 */
public class RealOtherSubjectImpl implements IOtherSubject {

    @Override
    public void say(String text) {
        System.out.println(text);
    }
}
