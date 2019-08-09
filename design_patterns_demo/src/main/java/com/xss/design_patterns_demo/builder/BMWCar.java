package com.xss.design_patterns_demo.builder;
/**
 * @Title: BMWCar
 * @Description: 车辆实现类
 * @author: TC20014
 * @date: 2019/7/26 13:58
 * @Version: 1.0
 */
public class BMWCar extends CarBase {

    /**
     * 启动
     */
    @Override
    protected void start() {
        System.out.println("BMWCar--------->启动");
    }

    /**
     * 停止
     */
    @Override
    protected void stop() {
        System.out.println("BMWCar--------->停止");
    }

    /**
     * 加油
     */
    @Override
    protected void comeOn() {
        System.out.println("BMWCar--------->加油");
    }

    /**
     * 鸣叫
     */
    @Override
    protected void tweet() {
        System.out.println("BMWCar--------->鸣叫");
    }
}
