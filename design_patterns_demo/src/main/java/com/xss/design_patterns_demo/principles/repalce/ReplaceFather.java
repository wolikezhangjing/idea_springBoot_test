package com.xss.design_patterns_demo.principles.repalce;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Title: ReplaceFather
 * @Description: 基类
 * @author: TC20014
 * @date: 2019/7/17 16:38
 * @Version: 1.0
 */
public class ReplaceFather {

    public Collection doSomething(HashMap map){
        System.out.println("repalceFather类中的doSomething被调用");
        return map.values();
    }

    public ReplaceFather() {
        System.out.println("repalceFather构造器被调用");
    }

    public Collection doSomethingSecond(Map map){
        System.out.println("repalceFather类中的doSomethingSecond被调用");
        return map.values();
    }
}
