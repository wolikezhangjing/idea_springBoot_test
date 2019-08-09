package com.xss.design_patterns_demo.factorymethod;

/**
 * @Title: TextProductFactoryMethodImpl
 * @Description: 具体工厂实现
 * @author: TC20014
 * @date: 2019/7/11 14:17
 * @Version: 1.0
 */
public class TextProductFactoryMethodImpl implements IFactoryMethodParent {
    @Override
    public IPrintProduct createInstance() {
        return new TextPrintImpl();
    }
}
