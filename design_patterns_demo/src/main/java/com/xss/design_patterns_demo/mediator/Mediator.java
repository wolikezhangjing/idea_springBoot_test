package com.xss.design_patterns_demo.mediator;

/**
 * @Title: Mediator
 * @Description: 具体中介者对象
 * @author: TC20014
 * @date: 2019/8/8 10:15
 * @Version: 1.0
 */
public class Mediator extends AbstractMediator {

    /**
     * 事件方法，处理多个对象之间的关系
     *
     * @param str
     * @param objects
     */
    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")) {
            // 采购
            this.buy((Integer) objects[0]);
        } else if (str.equals("sale.sell")) {
            // 销售
            this.sell((Integer) objects[0]);
        } else if (str.equals("sale.offsell")) {
            // 折价销售
            this.offSell();
        } else if (str.equals("stock.clear")) {
            // 清仓
            this.clearStock();
        }
    }

    /**
     * 采购商品
     * @param number
     */
    private void buy(int number) {
        int saleStatus = super.sale.getSaleStatus();
        // 商品水位线
        int waterLine = 40;
        if (saleStatus > waterLine) {
            System.out.println("最新一批采购商品数量为：" + number);
            super.stock.add(number);
        } else {
            int buyNumber = number / 2;
            System.out.println("最新一批采购商品数量为：" + buyNumber);
        }
    }

    /**
     * 销售商品
     * @param number
     */
    private void sell(int number) {
        // 如果库存商品数量不足销售，
        if (super.stock.getStockCommodityNumber() < number) {
            super.purchase.buyCommodity(number);
        }
        super.stock.cutBack(number);
    }

    /**
     * 折价销售
     */
    private void offSell() {
        System.out.println("折价销售商品数量为：" + stock.getStockCommodityNumber());
    }

    /**
     * 清仓
     */
    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuy();
    }
}
