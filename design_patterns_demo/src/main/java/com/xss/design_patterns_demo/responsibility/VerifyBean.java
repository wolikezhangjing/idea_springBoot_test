package com.xss.design_patterns_demo.responsibility;

/**
 * @Title: VerifyBean
 * @Description: 审核业务Bean对象
 * @author: TC20014
 * @date: 2019/8/9 16:12
 * @Version: 1.0
 */
public class VerifyBean {
    /**
     * 名称
     */
    private String name;

    /**
     * 审批金额
     */
    private Integer amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public VerifyBean(String name, Integer amount) {
        this.name = name;
        this.amount = amount;
    }

    public VerifyBean() {

    }
}
