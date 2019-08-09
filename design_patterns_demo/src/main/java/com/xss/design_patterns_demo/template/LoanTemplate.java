package com.xss.design_patterns_demo.template;
/**
 * @Title: LoanTemplate
 * @Description: 借款抽象模板
 * @author: TC20014
 * @date: 2019/7/25 13:55
 * @Version: 1.0
 */
public  abstract class LoanTemplate {
    /**
     * 申请
     */
    public abstract void apply();

    /**
     * 审批
     */
    public abstract void approve();

    /**
     * 放款
     */
    public abstract void extract();

    /**
     * 还款
     */
    public abstract void repayment();
    public final void close() {
        this.apply();
        this.approve();
        this.extract();
        this.repayment();
    }
}
