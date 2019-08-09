package com.xss.design_patterns_demo.proxy;
/**
 * @Title: IPhoneSubject
 * @Description: 手机主题接口
 * @author: TC20014
 * @date: 2019/8/1 15:49
 * @Version: 1.0
 */
public interface IPhoneSubject {
    /**
     * 拨打电话
     * @param phoneNumber
     */
    void call(String phoneNumber);
}
