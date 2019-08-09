package com.xss.design_patterns_demo.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: BuilderCarBaseTest
 * @Description:
 * @author: TC20014
 * @date: 2019/7/26 14:02
 * @Version: 1.0
 */
public class BuilderCarBaseTest {

    public static void main(String[] args) {
        notBuilderTest();
        System.out.println("\n==================分割线==================\n");
        primaryBuilderTest();
        System.out.println("\n==================分割线==================\n");
        finallyBuilderTest();
    }

    /**
     * 非构建这模式测试
     */
    public static void notBuilderTest() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("3");
        list.add("4");
        list.add("2");
        CarBase bmw = new BMWCar();
        bmw.setSequenceList(list);
        bmw.run();

        System.out.println("\n==================分割线==================\n");
        CarBase benz = new BenzCar();
        benz.setSequenceList(list);
        benz.run();
    }

    /**
     * 初级构建者模式测试
     */
    public static void primaryBuilderTest(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        CarBuilder benz = new BenzBuilder();
        benz.setSequence(list);
        benz.getCarBase().run();

        System.out.println("\n==================分割线==================\n");
        CarBuilder bmw = new BMWBuilder();
        bmw.setSequence(list);
        bmw.getCarBase().run();
    }

    /**
     * 最终建造者测试
     */
    public static void finallyBuilderTest(){
        DirectorBuilder builder = new DirectorBuilder();
        builder.getBenz310Car().run();
        System.out.println("\n=========Benz310Car=========分割线===========Benz310Car=======\n");
        builder.getBenz510Car().run();
        System.out.println("\n=========Benz510Car=========分割线===========Benz510Car=======\n");
        builder.getBMWCarC3().run();
        System.out.println("\n=========BMWCarC3=========分割线===========BMWCarC3=======\n");
        builder.getBMWCarC5().run();
        System.out.println("\n=========BMWCarC5=========分割线===========BMWCarC5=======");
    }
}
