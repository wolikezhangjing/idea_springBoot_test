package com.xss.design_patterns_demo.gongChang.controller;

import com.alibaba.fastjson.JSONObject;
import com.xss.design_patterns_demo.gongChang.common.PhoneFactoryPatterUtil;
import com.xss.design_patterns_demo.gongChang.service.PhoneInter;
import com.xss.design_patterns_demo.gongChang.service.impl.ApplePhoneImpl;
import com.xss.design_patterns_demo.gongChang.service.impl.HuaWeiPhoneImpl;
import com.xss.design_patterns_demo.gongChang.service.impl.OtherPhoneImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: FactoryPatternCtrl
 * @Description: 工厂模式测试请求控制器
 * @author: TC20014
 * @date: 2018/12/28 17:02
 * @Version: 1.0
 */
@RestController
@RequestMapping("/phone")
public class FactoryPatternCtrl {
    @Autowired
    private PhoneFactoryPatterUtil phoneFactoryPatterUtil;

    @GetMapping("/apple")
    public String getAppleBean(){
        PhoneInter apple = phoneFactoryPatterUtil.getFactoryBean(ApplePhoneImpl.class);
        System.out.print(apple.toString());
        return JSONObject.toJSONString(apple.production());
    }

    @GetMapping("/huawei")
    public String getHuaWeiBean(){
        PhoneInter huaWei = phoneFactoryPatterUtil.getFactoryBean(HuaWeiPhoneImpl.class);
        System.out.print(huaWei.toString());
        return JSONObject.toJSONString(huaWei.production());
    }

    @GetMapping("/other")
    public String getOtherBean(){
        PhoneInter other = phoneFactoryPatterUtil.getFactoryBean(OtherPhoneImpl.class);
        System.out.print(other.toString());
        return JSONObject.toJSONString(other.production());
    }
}
