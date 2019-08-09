package com.xss.design_patterns_demo.builder;

import java.util.List;

/**
 * @Title: CarBuilder
 * @Description: 建造者
 * @author: TC20014
 * @date: 2019/7/26 14:24
 * @Version: 1.0
 */
public abstract class CarBuilder {

    /**
     * 获取carBase对象
     * @return
     */
    public abstract CarBase getCarBase();

    /**
     * 定义建造顺序
     * @param sequenceList
     * @return
     */
    public abstract void setSequence(List<String> sequenceList);
}
