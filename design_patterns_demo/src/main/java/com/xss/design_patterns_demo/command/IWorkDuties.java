package com.xss.design_patterns_demo.command;

/**
 * @Title: IWorkDuties
 * @Description: 工作职责接口类
 * @author: TC20014
 * @date: 2019/8/8 16:03
 * @Version: 1.0
 */
public interface IWorkDuties {

    /**
     * 整理
     */
    void sortOut();

    /**
     * 对接
     */
    void docking();

    /**
     * 讨论
     */
    void discuss();

    /**
     * 确定方案
     */
    void confirm();
}
