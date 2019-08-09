package com.xss.design_patterns_demo.mediator;

/**
 * @Title: AbstractColleague
 * @Description: 抽象同事者基类
 * @author: TC20014
 * @date: 2019/8/8 10:06
 * @Version: 1.0
 */
public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator _mediator) {
        this.mediator = _mediator;
    }
}
