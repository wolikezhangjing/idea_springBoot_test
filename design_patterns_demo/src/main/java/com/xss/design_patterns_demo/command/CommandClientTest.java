package com.xss.design_patterns_demo.command;

/**
 * @Title: CommandClientTest
 * @Description: 命令模式客户端测试
 * @author: TC20014
 * @date: 2019/8/8 16:24
 * @Version: 1.0
 */
public class CommandClientTest {

    public static void main(String[] args) {
        Invoke admin = new Invoke();
        System.out.println("------------发布了【第一项】指令------------");
        AbstractCommand command = new AdministrativeActivitiesCommand();
        admin.setCommand(command);
        admin.action();
        System.out.println("------------发布了【第二项】指令------------");
        command = new AuditFinanceCommand();
        admin.setCommand(command);
        admin.action();
    }
}
