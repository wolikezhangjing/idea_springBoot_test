package com.xss.design_patterns_demo.principles.repalce;

/**
 * @Title: HuaweiNotebook
 * @Description: 华为笔记本
 * @author: TC20014
 * @date: 2019/7/15 14:47
 * @Version: 1.0
 */
public class AppleMacNotebook extends AbstractNotebook {

    /**
     * 笔记本开机
     */
    @Override
    public void boot() {
        System.out.println("AppleMacNotebook 开机了");
    }
}
