package com.xss.design_patterns_demo.Abstractfactorypattern;

public class SonyDevice implements IDeviceFacorty {

    @Override
    public void manufacturingPhone() {
        System.out.println("制造了索尼 X30 手机");
    }
}
