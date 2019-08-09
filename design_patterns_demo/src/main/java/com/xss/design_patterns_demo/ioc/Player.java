package com.xss.design_patterns_demo.ioc;

public class Player {

    public void play(Game game){
        System.out.println("玩家开始");
        game.run();
    }
}
