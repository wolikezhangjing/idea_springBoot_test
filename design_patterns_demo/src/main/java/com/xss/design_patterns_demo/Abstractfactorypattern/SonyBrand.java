package com.xss.design_patterns_demo.Abstractfactorypattern;

public class SonyBrand implements IBrandFacorty {

    @Override
    public void product() {
        System.out.println("创建了Sony品牌");
    }
}
