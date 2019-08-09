package com.xss.design_patterns_demo.template;

/**
 * @Title: CustTwoLoan
 * @Description: 客户二借款
 * @author: TC20014
 * @date: 2019/7/25 13:59
 * @Version: 1.0
 */
public class CustTwoLoan extends LoanTemplate {

    @Override
    public void apply() {
        System.out.println("CustTwo申请借款5000");
    }

    @Override
    public void approve() {
        System.out.println("CustTwo申请借款等待审批……");
    }

    @Override
    public void extract() {
        System.out.println("CustTwo申请借款审批完成，开始放款……");
    }

    @Override
    public void repayment() {
        System.out.println("CustTwo申请借款5000放款完成开始还款……");
    }
}
