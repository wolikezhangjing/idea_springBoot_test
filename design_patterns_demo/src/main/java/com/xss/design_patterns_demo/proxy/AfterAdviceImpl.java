package com.xss.design_patterns_demo.proxy;

/**
 * @Title: AfterAdviceImpl
 * @Description: 后置通知
 * @author: TC20014
 * @date: 2019/8/1 15:57
 * @Version: 1.0
 */
public class AfterAdviceImpl implements IAdvice {

    /**
     * 执行通知
     */
    @Override
    public void executeAdvice() {
        System.out.println("动态代理执行后---> 后置通知");
    }
}
