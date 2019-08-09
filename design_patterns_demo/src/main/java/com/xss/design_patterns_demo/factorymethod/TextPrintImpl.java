package com.xss.design_patterns_demo.factorymethod;
/**
 * @Title: TextPrintImpl
 * @Description: 具体产品实现类，文字打印
 * @author: TC20014
 * @date: 2019/7/11 14:11
 * @Version: 1.0
 */
public class TextPrintImpl implements IPrintProduct {
    @Override
    public void print() {
        System.out.println("文字产品打印！");
    }
}
