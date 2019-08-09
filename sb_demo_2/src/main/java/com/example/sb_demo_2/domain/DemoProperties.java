package com.example.sb_demo_2.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Title: DemoProperties
 * @Description: 属性文件配置映射实体
 * @author: TC20014
 * @date: 2018/11/7 10:55
 * @Version: 1.0
 */
@Component
@Data
public class DemoProperties {
    @Value("${com.springboot.demo.title}")
    private String title;
    @Value("${com.springboot.demo.name}")
    private String name;
    @Value("${com.springboot.demo.url}")
    private String url;
    @Value("${com.springboot.demo.attribute}")
    private String attribute;
    @Value("${com.springboot.random.value}")
    private String value;
    @Value("${com.springboot.random.int}")
    private Integer intValue;
    @Value("${com.springboot.random.long}")
    private Long longValue;
    @Value("${com.springboot.random.uuid}")
    private String uuid;
    @Value("${com.spring.boot.random.test1}")
    private Integer test1;
    @Value("${com.spring.boot.random.test2}")
    private Integer test2;
}
