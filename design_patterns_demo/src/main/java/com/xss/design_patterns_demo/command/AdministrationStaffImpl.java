package com.xss.design_patterns_demo.command;

/**
 * @Title: AdministrationStaffImpl
 * @Description: 行政管理岗位
 * @author: TC20014
 * @date: 2019/8/8 16:09
 * @Version: 1.0
 */
public class AdministrationStaffImpl implements IWorkDuties {

    /**
     * 整理
     */
    @Override
    public void sortOut() {
        System.out.println("【行政管理】人员开始整理【资料】");
    }

    /**
     * 对接
     */
    @Override
    public void docking() {
        System.out.println("【行政管理】人员开始与客户【对接】");
    }

    /**
     * 讨论
     */
    @Override
    public void discuss() {
        System.out.println("【行政管理】人员开始与客户【讨论】");
    }

    /**
     * 确定方案
     */
    @Override
    public void confirm() {
        System.out.println("【行政管理】人员开始与客户【确定方案】");
    }
}
