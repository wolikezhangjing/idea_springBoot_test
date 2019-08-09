package com.xss.design_patterns_demo.prototype;

/**
 * @Title: PrototypePhone
 * @Description: 原型模式
 * @author: TC20014
 * @date: 2019/8/2 10:30
 * @Version: 1.0
 */
public class PrototypePhone implements Cloneable {

    private String sendSMSContent;

    public PrototypePhone(SmsVO smsVO) {
        this.sendSMSContent = smsVO.getCustName() + smsVO.getPhoneNum() + smsVO.getContext();

    }

    public void sendSms(){
        System.out.println(sendSMSContent);
    }

    /**
     * 重写克隆方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected PrototypePhone clone() throws CloneNotSupportedException {
        PrototypePhone clone = null;
        try {
            clone = (PrototypePhone)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getSendSMSContent() {
        return sendSMSContent;
    }

    public void setSendSMSContent(String sendSMSContent) {
        this.sendSMSContent = sendSMSContent;
    }
}
