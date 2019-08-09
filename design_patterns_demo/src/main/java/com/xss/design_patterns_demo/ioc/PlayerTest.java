package com.xss.design_patterns_demo.ioc;

/**
 * @Title: PlayerTest
 * @Description: 依赖倒置原则实际上就是面向接口编程。
 * @author: TC20014
 * @date: 2019/7/18 15:10
 * @Version: 1.0
 */
public class PlayerTest {

    public static void main(String[] args) {
        Player player = new Player();
        player.play(new Dota());
        player.play(new LOL());
    }
}
