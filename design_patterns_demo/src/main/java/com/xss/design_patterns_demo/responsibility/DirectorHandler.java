package com.xss.design_patterns_demo.responsibility;

import java.util.Random;

/**
 * @Title: SupervisorHandler
 * @Description: 责任链模式：具体处理者——————————总监审批
 * @author: TC20014
 * @date: 2019/8/9 16:27
 * @Version: 1.0
 */
public class DirectorHandler extends AbstractHandler {

    public DirectorHandler(String name) {
        super(name);
    }

    /**
     * 审批
     *
     * @param verifyBean
     * @return
     */
    @Override
    public boolean approval(VerifyBean verifyBean) {
        Random random = new Random();
        boolean result = random.nextInt(1000) > 500;
        String log = "总监<%s> 审批 <%s> 的团建申请，申请金额： <%d> ，审批结果：<%s> ";
        System.out.println(String.format(log, this.name, verifyBean.getName(), verifyBean.getAmount(), result ? "批准" : "不批准"));
        return result;
    }


}
