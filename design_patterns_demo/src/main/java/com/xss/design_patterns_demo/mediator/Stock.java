package com.xss.design_patterns_demo.mediator;

/**
 * @Title: Stock
 * @Description: 库存：具体同事类
 * @author: TC20014
 * @date: 2019/8/8 10:08
 * @Version: 1.0
 */
public class Stock extends AbstractColleague  {

    public Stock(AbstractMediator _mediator) {
        super(_mediator);
    }
    /** 商品数量 */
    private static int COMMODITY_NUMBER = 100;

    /**
     * 增加商品数
     * @param number
     */
    public void add(int number) {
        COMMODITY_NUMBER += number;
        System.out.println("【增加后】当前商品库存数量为：" + COMMODITY_NUMBER);
    }

    /**
     * 减少库存商品数量
     */
    public void cutBack(int number) {
        COMMODITY_NUMBER -= number;
        System.out.println("【减少后】当前商品库存数量为：" + COMMODITY_NUMBER);
    }


    public void clearStock() {
        System.out.println("【盘点】库存商品数量为：" + COMMODITY_NUMBER);
        super.mediator.execute("stock.clear");
    }

    /**
     * 获取当前库存商品水量水位
     * @return
     */
    public int getStockCommodityNumber() {
        return COMMODITY_NUMBER;
    }

}
