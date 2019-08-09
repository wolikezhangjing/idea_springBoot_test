package com.xss.design_patterns_demo.Abstractfactorypattern;

public class HuaweiBrand implements IBrandFacorty {
    @Override
    public void product() {
        System.out.println("创建Huawei品牌");
    }
}
