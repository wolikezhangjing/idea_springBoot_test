package com.xss.design_patterns_demo.mediator;

/**
 * @Title: MediatorClientTest
 * @Description: 中介者模式测试
 * @author: TC20014
 * @date: 2019/8/8 10:57
 * @Version: 1.0
 */
public class MediatorClientTest {

    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        System.out.println("---------------采购人员采购商品---------------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyCommodity(100);
        System.out.println("---------------销售人员销售商品---------------");
        Sale sale = new Sale(mediator);
        sale.sellCommodity(20);
        System.out.println("---------------库存人员清库处理---------------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
