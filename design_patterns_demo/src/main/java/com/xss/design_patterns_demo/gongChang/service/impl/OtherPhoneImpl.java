package com.xss.design_patterns_demo.gongChang.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.xss.design_patterns_demo.gongChang.domain.Phone;
import com.xss.design_patterns_demo.gongChang.service.PhoneInter;

import java.math.BigDecimal;

public class OtherPhoneImpl implements PhoneInter {
    @Override
    public String production() {
        Phone otherPhone = new Phone();
        otherPhone.setName("三教九流");
        otherPhone.setColor("母鸡啊");
        otherPhone.setPriceAmount(new BigDecimal("1999.99"));
        return JSONObject.toJSONString(otherPhone);
    }
}
