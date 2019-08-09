package com.xss.design_patterns_demo.mediator;

/**
 * @Title: AbstractMediator
 * @Description: 抽象中介者基类
 * @author: TC20014
 * @date: 2019/8/8 10:04
 * @Version: 1.0
 */
public abstract class AbstractMediator {

    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    /**
     * 事件方法，处理多个对象之间的关系
     * @param str
     * @param objects
     */
    public abstract void execute(String str, Object... objects);
}
