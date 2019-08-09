package com.xss.design_patterns_demo.builder;

import java.util.List;

/**
 * @Title: BMWBuilder
 * @Description: 宝马建造类
 * @author: TC20014
 * @date: 2019/7/26 14:32
 * @Version: 1.0
 */
public class BMWBuilder extends CarBuilder {

    private BMWCar bmwCar = new BMWCar();

    /**
     * 获取carBase对象
     *
     * @return
     */
    @Override
    public CarBase getCarBase() {
        return this.bmwCar;
    }

    /**
     * 定义建造顺序
     *
     * @param sequenceList
     * @return
     */
    @Override
    public void setSequence(List<String> sequenceList) {
        this.bmwCar.setSequenceList(sequenceList);
    }
}
