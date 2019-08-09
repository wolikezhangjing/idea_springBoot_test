package com.xss.design_patterns_demo.command;

/**
 * @Title: AuditFinanceCommand
 * @Description: 审核财务命令
 * @author: TC20014
 * @date: 2019/8/8 16:17
 * @Version: 1.0
 */
public class AuditFinanceCommand extends AbstractCommand {

    /**
     * 执行命令
     */
    @Override
    public void executeCommand() {
        super.financeStaff.confirm();
        super.financeStaff.docking();
    }
}
