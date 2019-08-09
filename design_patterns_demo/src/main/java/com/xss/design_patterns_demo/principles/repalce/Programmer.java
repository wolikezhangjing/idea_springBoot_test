package com.xss.design_patterns_demo.principles.repalce;

/**
 * @Title: Programmer
 * @Description: 使用者码农
 * @author: TC20014
 * @date: 2019/7/15 14:50
 * @Version: 1.0
 */
public class Programmer {

    private AbstractNotebook notebook;

    public void setNotebook(AbstractNotebook notebook) {
        this.notebook = notebook;
    }

    public void use(){
        notebook.boot();
        System.out.println("码农连接上了server，开始了rm -rf * 操作！");
    }
}
