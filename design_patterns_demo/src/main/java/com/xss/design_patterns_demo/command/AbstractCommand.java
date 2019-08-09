package com.xss.design_patterns_demo.command;

/**
 * @Title: AbstractCommand
 * @Description: 抽象命令基类
 * @author: TC20014
 * @date: 2019/8/8 16:12
 * @Version: 1.0
 */
public abstract class AbstractCommand {

    protected AdministrationStaffImpl administrationStaff = new AdministrationStaffImpl();
    protected FinanceStaffImpl financeStaff = new FinanceStaffImpl();

    /**
     * 执行命令
     */
    public abstract void executeCommand();
}
