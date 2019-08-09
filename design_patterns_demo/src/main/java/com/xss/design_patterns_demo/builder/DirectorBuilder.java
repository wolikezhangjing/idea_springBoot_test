package com.xss.design_patterns_demo.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: DirectorBuilder
 * @Description: 建造者导演类
 * @author: TC20014
 * @date: 2019/7/26 14:40
 * @Version: 1.0
 */
public class DirectorBuilder {

    private CarBuilder benz = new BenzBuilder();
    private CarBuilder bmw = new BMWBuilder();
    private List<String> list = new ArrayList<>();

    public CarBase getBenz310Car(){
        list.add("1");
        list.add("4");
        this.benz.setSequence(list);
        return this.benz.getCarBase();
    }

    public CarBase getBenz510Car(){
        this.list.clear();
        list.add("1");
        list.add("4");
        list.add("3");
        list.add("2");
        this.benz.setSequence(list);
        return this.benz.getCarBase();
    }

    public CarBase getBMWCarC3(){
        this.list.clear();
        list.add("2");
        list.add("3");
        this.bmw.setSequence(list);
        return this.bmw.getCarBase();
    }

    public CarBase getBMWCarC5(){
        this.list.clear();
        list.add("2");
        list.add("4");
        list.add("1");
        list.add("3");
        this.bmw.setSequence(list);
        return this.bmw.getCarBase();
    }
}
