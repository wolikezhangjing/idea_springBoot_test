package com.xss.design_patterns_demo.Abstractfactorypattern;

public class SonyFactory implements  IAbstractFactory {

    @Override
    public IBrandFacorty createBrand() {
        return new SonyBrand();
    }

    @Override
    public IDeviceFacorty createDevice() {
        return new SonyDevice();
    }
}
