package com.xss.design_patterns_demo.responsibility;

/**
 * @Title: AbstractHandler
 * @Description: 责任链模式：抽象处理者
 * @author: TC20014
 * @date: 2019/8/9 16:10
 * @Version: 1.0
 */
public abstract class AbstractHandler {

    protected String name;
    protected AbstractHandler nextHandler;

    public AbstractHandler(String name) {
        this.name = name;
    }

    /**
     * 审批
     * @param verifyBean
     * @return
     */
    public abstract boolean approval(VerifyBean verifyBean);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstractHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
