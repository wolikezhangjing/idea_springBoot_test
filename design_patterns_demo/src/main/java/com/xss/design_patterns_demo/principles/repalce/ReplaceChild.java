package com.xss.design_patterns_demo.principles.repalce;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Title: ReplaceChild
 * @Description: 子类
 * @author: TC20014
 * @date: 2019/7/17 16:44
 * @Version: 1.0
 */
public class ReplaceChild extends ReplaceFather {

    public ReplaceChild() {
        System.out.println("ReplaceChild构造器被调用");
    }

    public Collection doSomething(Map map) {
        System.out.println("repalceFather子类ReplaceChild调用了doSomething方法");
        return map.values();
    }


    public Collection doSomethingSecond(HashMap map) {
        System.out.println("repalceFather子类ReplaceChild调用了doSomethingSecond方法");
        return map.values();
    }
}
