package com.xss.design_patterns_demo.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: CarBase
 * @Description: 汽车抽象类
 * @author: TC20014
 * @date: 2019/7/26 11:50
 * @Version: 1.0
 */
public abstract class CarBase {

    private List<String> sequenceList = new ArrayList<>();

    /**
     * 启动
     */
    protected abstract void start();

    /**
     * 停止
     */
    protected abstract void stop();

    /**
     * 加油
     */
    protected abstract void comeOn();

    /**
     * 鸣叫
     */
    protected abstract void tweet();

    public final void run(){
        if (null != sequenceList && sequenceList.size() > 0) {
            for (String string : sequenceList) {
                if ("1".equals(string)) {
                    this.start();
                } else if ("2".equals(string)) {
                    this.stop();
                } else if ("3".equals(string)) {
                    this.comeOn();
                } else if ("4".equals(string)) {
                    this.tweet();
                }
            }
        }
    }

    public void setSequenceList(List<String> sequenceList) {
        this.sequenceList = sequenceList;
    }
}
