package com.xss.design_patterns_demo.ce_lue_mo_shi.controller;

import com.xss.design_patterns_demo.ce_lue_mo_shi.common.StrategyUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hehe")
public class StrategyPatternCtrl {

    @Resource
    private StrategyUtil strategyUtil;

    @GetMapping("/query/{type}")
    public String query(@PathVariable String type){

        return strategyUtil.exectuStrategyResult(type, 100, 50).toString();
    }

    @GetMapping("/add")
    public String add(){
        return "hello";
    }
}
