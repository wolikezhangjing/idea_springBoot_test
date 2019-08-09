package com.xss.design_patterns_demo.factorymethod;

/**
 * @Title: FactoryMethodParentTest
 * @Description: 工厂方法模式测试
 * @author: TC20014
 * @date: 2019/7/11 14:20
 * @Version: 1.0
 */
public class FactoryMethodParentTest {

    public static void main(String[] args) {
        IFactoryMethodParent iFactoryMethodParent = new PhotoProductFactoryMethodImpl();
        IPrintProduct photoProduct = iFactoryMethodParent.createInstance();
        photoProduct.print();

        IFactoryMethodParent iFactoryMethodParent1 = new TextProductFactoryMethodImpl();
        IPrintProduct textProduct = iFactoryMethodParent1.createInstance();
        textProduct.print();
    }
}
