package com.xss.design_patterns_demo.factorymethod;
/**
 * @Title: PhotoProductFactoryMethodImpl
 * @Description: 图像产品工厂
 * @author: TC20014
 * @date: 2019/7/11 14:19
 * @Version: 1.0
 */
public class PhotoProductFactoryMethodImpl implements IFactoryMethodParent {

    @Override
    public IPrintProduct createInstance() {
        return new PhotoPrintImpl();
    }
}
