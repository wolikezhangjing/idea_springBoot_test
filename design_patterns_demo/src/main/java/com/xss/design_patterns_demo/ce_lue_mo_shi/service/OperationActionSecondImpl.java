package com.xss.design_patterns_demo.ce_lue_mo_shi.service;

import com.xss.design_patterns_demo.ce_lue_mo_shi.service.inter.StrategyInter;
import org.springframework.stereotype.Service;

@Service("bOperationActionSecondImpl")
public class OperationActionSecondImpl implements StrategyInter {
    @Override
    public Integer saveOperation(Integer key, Integer value) {

        return key * value;
    }
}
