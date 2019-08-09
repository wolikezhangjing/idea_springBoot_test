package com.xss.design_patterns_demo.Abstractfactorypattern;

public class HuaweiFacorty implements IAbstractFactory {
    @Override
    public IBrandFacorty createBrand() {
        return new HuaweiBrand();
    }

    @Override
    public IDeviceFacorty createDevice() {
        return new HuawerDevice();
    }
}
