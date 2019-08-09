package com.xss.design_patterns_demo.gongChang.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.xss.design_patterns_demo.gongChang.domain.Phone;
import com.xss.design_patterns_demo.gongChang.service.PhoneInter;

import java.math.BigDecimal;

/**
 * @Title: ApplePhoneImpl
 * @Description: TODO
 * @author: TC20014
 * @date: 2018/12/28 16:47
 * @Version: 1.0
 */

public class ApplePhoneImpl implements PhoneInter {

    @Override
    public String production() {
        Phone applePhone = new Phone();
        applePhone.setName("乔教主");
        applePhone.setColor("银色");
        applePhone.setPriceAmount(new BigDecimal("5888"));
        return JSONObject.toJSONString(applePhone);
    }
}
