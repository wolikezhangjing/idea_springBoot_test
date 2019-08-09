package com.xss.design_patterns_demo.builder;

import java.util.List;

/**
 * @Title: BenzBuilder
 * @Description: 奔驰建造类
 * @author: TC20014
 * @date: 2019/7/26 14:32
 * @Version: 1.0
 */
public class BenzBuilder extends CarBuilder {

    private BenzCar benzCar = new BenzCar();

    /**
     * 获取carBase对象
     *
     * @return
     */
    @Override
    public CarBase getCarBase() {
        return this.benzCar;
    }

    /**
     * 定义建造顺序
     *
     * @param sequenceList
     * @return
     */
    @Override
    public void setSequence(List<String> sequenceList) {
        this.benzCar.setSequenceList(sequenceList);
    }
}
