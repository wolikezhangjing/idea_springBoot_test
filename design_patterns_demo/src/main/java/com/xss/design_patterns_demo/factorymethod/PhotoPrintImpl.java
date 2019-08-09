package com.xss.design_patterns_demo.factorymethod;

/**
 * @Title: PhotoPrintImpl
 * @Description: 具体产品类，图像产品打印
 * @author: TC20014
 * @date: 2019/7/11 14:12
 * @Version: 1.0
 */
public class PhotoPrintImpl implements IPrintProduct {
    @Override
    public void print() {
        System.out.println("图像产品打印！");
    }
}
