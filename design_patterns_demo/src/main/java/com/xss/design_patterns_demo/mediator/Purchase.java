package com.xss.design_patterns_demo.mediator;

/**
 * @Title: Purchase
 * @Description: 采购：具体同事类
 * @author: TC20014
 * @date: 2019/8/8 10:08
 * @Version: 1.0
 */
public class Purchase extends AbstractColleague {

    public Purchase(AbstractMediator _abstractMediator) {
        super(_abstractMediator);
    }

    public void buyCommodity(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    public void refuseBuy() {
        System.out.println("停止商品采购！");
    }
}
