package com.xss.design_patterns_demo.command;

/**
 * @Title: AdministrativeActivitiesCommand
 * @Description: 行政活动命令
 * @author: TC20014
 * @date: 2019/8/8 16:19
 * @Version: 1.0
 */
public class AdministrativeActivitiesCommand extends AbstractCommand {

    /**
     * 执行命令
     */
    @Override
    public void executeCommand() {
        super.administrationStaff.docking();
        super.administrationStaff.discuss();
        super.administrationStaff.confirm();
    }
}
