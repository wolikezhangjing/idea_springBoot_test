package com.xss.design_patterns_demo.gongChang.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.xss.design_patterns_demo.gongChang.domain.Phone;
import com.xss.design_patterns_demo.gongChang.service.PhoneInter;

import java.math.BigDecimal;

public class HuaWeiPhoneImpl implements PhoneInter {
    @Override
    public String production() {
        Phone huaWeiPhone = new Phone();
        huaWeiPhone.setName("任教主");
        huaWeiPhone.setColor("极光色");
        huaWeiPhone.setPriceAmount(new BigDecimal("3999"));
        return JSONObject.toJSONString(huaWeiPhone);
    }
}
