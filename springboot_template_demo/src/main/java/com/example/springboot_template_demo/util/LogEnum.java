package com.example.springboot_template_demo.util;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Title: LogEnum
 * @Description: 不同日志级别枚举类
 * @author: TC20014
 * @date: 2018/11/9 14:37
 * @Version: 1.0
 */
public enum LogEnum {
    /* 业务逻辑 */
    BUSSINESS("bussiness"),
    /* 平台 */
    PLATFORM("platform"),
    /* 数据库 */
    DB("db"),
    /* 异常 */
    EXCEPTION("exception");

    private String category;

    LogEnum(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
