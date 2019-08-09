package com.xss.design_patterns_demo.Abstractfactorypattern;

/**
 * @Title: IAbstractFactory
 * @Description: 抽象工厂，所有子类都必须实现该抽象工厂
 * @author: TC20014
 * @date: 2019/7/11 18:15
 * @Version: 1.0
 */
public interface IAbstractFactory {

    IBrandFacorty createBrand();

    IDeviceFacorty createDevice();
}
