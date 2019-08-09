package com.xss.design_patterns_demo.Abstractfactorypattern;

public class HuawerDevice implements IDeviceFacorty {

    @Override
    public void manufacturingPhone() {
        System.out.println("制造了Huawei P30 Pro手机");
    }
}
