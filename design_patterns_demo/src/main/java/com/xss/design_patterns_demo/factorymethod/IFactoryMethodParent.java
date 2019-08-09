package com.xss.design_patterns_demo.factorymethod;

/**
 * @Title: IFactoryMethodParent
 * @Description: 工厂方法模式父节点
 * @author: TC20014
 * @date: 2019/7/11 11:21
 * @Version: 1.0
 */
public interface IFactoryMethodParent {

    IPrintProduct createInstance();
}
