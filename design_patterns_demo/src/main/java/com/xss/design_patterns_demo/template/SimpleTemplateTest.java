package com.xss.design_patterns_demo.template;

/**
 * @Title: SimpleTemplateTest
 * @Description: 简单模板方法模式测试
 * @author: TC20014
 * @date: 2019/7/25 14:01
 * @Version: 1.0
 */
public class SimpleTemplateTest {

    public static void main(String[] args) {
        LoanTemplate loanTemplate1 = new CustOneLoan();
        loanTemplate1.close();

        System.out.println("\n==========分割线=============\n");

        LoanTemplate loanTemplate2 = new CustTwoLoan();
        loanTemplate2.close();
    }
}
