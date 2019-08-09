package com.example.springboot_resultful_demo.domain;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Title: Person
 * @Description: 人员信息实体
 * @author: TC20014
 * @date: 2018/12/20 15:25
 * @Version: 1.0
 */
@Component
@Data
@ApiModel(value = "用户信息实体")
public class Person implements Serializable {

    private String name;
    private String code;
    private Integer age;
    private String remark;

}
