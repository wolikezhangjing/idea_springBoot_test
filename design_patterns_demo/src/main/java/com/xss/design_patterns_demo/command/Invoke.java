package com.xss.design_patterns_demo.command;

/**
 * @Title: Invoke
 * @Description: 调用者：负责人角色
 * @author: TC20014
 * @date: 2019/8/8 16:22
 * @Version: 1.0
 */
public class Invoke {

    private AbstractCommand command;

    public AbstractCommand getCommand() {
        return command;
    }

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void action(){
        this.command.executeCommand();
    }
}
