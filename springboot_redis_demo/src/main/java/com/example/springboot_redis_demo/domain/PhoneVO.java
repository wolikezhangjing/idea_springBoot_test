package com.example.springboot_redis_demo.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Title: UserVo
 * @Description: 用户VO对象，用于测试redis存储
 * @author: TC20014
 * @date: 2018/11/7 15:12
 * @Version: 1.0
 */
@Component
@Data
//@Builder(toBuilder = true)
public class PhoneVO implements Serializable {

    private String id;
    private String name;
    private String price;
    private String color;
}
