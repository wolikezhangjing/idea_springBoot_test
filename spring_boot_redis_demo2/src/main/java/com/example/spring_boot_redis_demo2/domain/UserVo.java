package com.example.spring_boot_redis_demo2.domain;


import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Data
//@Builder(toBuilder = true)
public class UserVo implements Serializable {

    public static final String Table = "t_user";

    private String name;
    private String address;
    private Integer age;
}
