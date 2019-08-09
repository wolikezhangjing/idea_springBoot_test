package com.xss.design_patterns_demo.principles.repalce;
/**
 * @Title: WorkTest
 * @Description: 工作
 * @author: TC20014
 * @date: 2019/7/15 14:54
 * @Version: 1.0
 */
public class WorkTest {

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.setNotebook(new AppleMacNotebook());
        programmer.use();
        System.out.println("======================================");
        programmer.setNotebook(new HPNotebook());
        programmer.use();
    }

}
