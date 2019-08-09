package com.xss.design_patterns_demo.template;

/**
 * @Title: CustOneLoan
 * @Description: 客户已借款
 * @author: TC20014
 * @date: 2019/7/25 13:58
 * @Version: 1.0
 */
public class CustOneLoan extends LoanTemplate {

    @Override
    public void apply() {
        System.out.println("CustOne申请借款1000");
    }

    @Override
    public void approve() {
        System.out.println("CustOne申请借款等待审批……");
    }

    @Override
    public void extract() {
        System.out.println("CustOne申请借款审批完成，开始放款……");
    }

    @Override
    public void repayment() {
        System.out.println("CustOne申请借款1000放款完成开始还款……");
    }
}
