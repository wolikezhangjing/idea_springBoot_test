package com.xss.design_patterns_demo.responsibility;

/**
 * @Title: ResponsibilityClientTest
 * @Description: 责任链模式客户端测试
 * @author: TC20014
 * @date: 2019/8/9 16:31
 * @Version: 1.0
 */
public class ResponsibilityClientTest {

    public static void main(String[] args) {
        SupervisorHandler supervisorHandler = new SupervisorHandler("张三");
        ManagerHandler managerHandler = new ManagerHandler("李四");
        DirectorHandler directorHandler = new DirectorHandler("王五");

        supervisorHandler.setNextHandler(managerHandler);
        managerHandler.setNextHandler(directorHandler);

        // 发起请假申请
        boolean result1 = supervisorHandler.approval(new VerifyBean("小旋锋", 100));
        System.out.println("最终结果：" + result1 + "\n");

        boolean result2 = supervisorHandler.approval(new VerifyBean("小旋锋", 800));
        System.out.println("最终结果：" + result2 + "\n");

        boolean result3 = supervisorHandler.approval(new VerifyBean("小旋锋", 600));
        System.out.println("最终结果：" + result3 + "\n");
    }
}
