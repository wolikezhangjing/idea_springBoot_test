package com.xss.design_patterns_demo.gongChang.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * 电话实体对象
 * @Title: Phone
 * @Description: TODO
 * @author: TC20014
 * @date: 2018/12/28 16:49
 * @Version: 1.0
 */
@Data
@Component
public class Phone {
    /**名称*/
    private String name;
    /**颜色*/
    private String color;
    /**售价*/
    private BigDecimal priceAmount;

}
