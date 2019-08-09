package com.xss.design_patterns_demo.prototype;

/**
 * @Title: SmsVO
 * @Description: 短信VO
 * @author: TC20014
 * @date: 2019/8/2 10:33
 * @Version: 1.0
 */
public class SmsVO {

    private String phoneNum;
    private String context;
    private String custName;

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }
}
