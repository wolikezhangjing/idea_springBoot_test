package com.xss.design_patterns_demo.ce_lue_mo_shi.common;

import com.xss.design_patterns_demo.ce_lue_mo_shi.service.inter.StrategyInter;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
@Data
@Component
public class StrategyUtil {

    @Autowired
    private Map<String, StrategyInter> strategyMap = new ConcurrentHashMap<>();

    public Integer exectuStrategyResult(String type, Integer key, Integer value){
        return strategyMap.get(type).saveOperation(key, value);
    }
}
