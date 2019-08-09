package com.xss.design_patterns_demo.principles.repalce;

import java.util.HashMap;

/**
 * @Title: ReplaceTest
 * @Description: 测试
 * @author: TC20014
 * @date: 2019/7/17 16:48
 * @Version: 1.0
 */
public class ReplaceTest {

    /**
     * 里氏替换原则
     * 1.子类中方法的前置条件必须与超类中被覆写的方法的前置条件相同或者更宽松
     * @param args
     */
    public static void main(String[] args) {
        // 父类入参 HashMap 类型，子类入参 Map 类型。
        // 当子类实例化并调用重载后的方法时，子类方法将永远不会被执行到
        ReplaceFather father = new ReplaceFather();
        HashMap hashMapF = new HashMap(10);
        father.doSomething(hashMapF);
        System.out.println("=========================================");
        ReplaceChild child = new ReplaceChild();
        HashMap hashMapC = new HashMap(10);
        child.doSomething(hashMapC);

        System.out.println("\n");
        System.out.println("当父类入参范围大于子类入参范围时测试=====================");

        ReplaceFather fatherSecond = new ReplaceFather();
        fatherSecond.doSomethingSecond(hashMapF);
        ReplaceChild childSecond = new ReplaceChild();
        childSecond.doSomethingSecond(hashMapF);
    }
}
