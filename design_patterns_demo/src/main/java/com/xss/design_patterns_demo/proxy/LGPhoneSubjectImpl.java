package com.xss.design_patterns_demo.proxy;
/**
 * @Title: LGPhoneSubjectImpl
 * @Description: 手机真实主题实现类
 * @author: TC20014
 * @date: 2019/8/1 15:52
 * @Version: 1.0
 */
public class LGPhoneSubjectImpl implements IPhoneSubject {

    /**
     * 拨打电话
     *
     * @param phoneNumber
     */
    @Override
    public void call(String phoneNumber) {
        System.out.println("给[" + phoneNumber + "]号码拨打电话");
    }
}
