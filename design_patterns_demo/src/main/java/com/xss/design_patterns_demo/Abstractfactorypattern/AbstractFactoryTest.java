package com.xss.design_patterns_demo.Abstractfactorypattern;

/**
 * @Title: AbstractFactoryTest
 * @Description: 抽象工厂测试
 * @author: TC20014
 * @date: 2019/7/12 10:57
 * @Version: 1.0
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        IAbstractFactory huaweiFacorty = new HuaweiFacorty();
        IBrandFacorty huaweiFacortyBrand = huaweiFacorty.createBrand();
        IDeviceFacorty huaweiFacortyDevice = huaweiFacorty.createDevice();
        huaweiFacortyBrand.product();
        huaweiFacortyDevice.manufacturingPhone();

        IAbstractFactory sonyFactory = new SonyFactory();
        IBrandFacorty sonyFactoryBrand = sonyFactory.createBrand();
        IDeviceFacorty sonyFactoryDevice = sonyFactory.createDevice();
        sonyFactoryBrand.product();
        sonyFactoryDevice.manufacturingPhone();

    }

}
