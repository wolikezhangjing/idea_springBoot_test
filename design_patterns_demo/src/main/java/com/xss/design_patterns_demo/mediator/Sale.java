package com.xss.design_patterns_demo.mediator;

import java.util.Random;

/**
 * @Title: Sale
 * @Description: 销售：具体同事类
 * @author: TC20014
 * @date: 2019/8/8 10:08
 * @Version: 1.0
 */
public class Sale extends AbstractColleague{

    public Sale(AbstractMediator _mediator) {
        super(_mediator);
    }

    /**
     * 销售商品
     * @param number
     */
    public void sellCommodity(int number) {
        super.mediator.execute("sale.sell", number);
        System.out.println("销售商品数量[ " + number + " ]");
    }

    /**
     * 反馈销售情况，0～100变化，0代表根本就没人买，100代表非常畅销，出一个卖一个
     * @return
     */
    public int getSaleStatus(){
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("商品销售情况为：" + saleStatus);
        return saleStatus;
    }

    /**
     * 折价处理
     */
    public void offSale(){
        super.mediator.execute("sale.offsell");
    }
}
