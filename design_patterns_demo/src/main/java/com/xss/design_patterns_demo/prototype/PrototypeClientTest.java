package com.xss.design_patterns_demo.prototype;

/**
 * @Title: PrototypeClientTest
 * @Description: 原型模式测试
 * @author: TC20014
 * @date: 2019/8/6 11:34
 * @Version: 1.0
 */
public class PrototypeClientTest {

    public static void main(String[] args) {
        //test();
        testSecondary();
    }

    public static void test(){
        String[][] initData = new String[5][3];
        String[] a = {"姓名：张三\t", "手机号：15712345687\t", "原型模式一"};
        String[] b = {"姓名：李四\t", "手机号：18912345678\t", "原型模式二"};
        String[] c = {"姓名：王五\t", "手机号：13712345678\t", "原型模式三"};
        String[] d = {"姓名：初六\t", "手机号：17087654321\t", "原型模式四"};
        String[] e = {"姓名：王二\t", "手机号：14401928374\t", "原型模式五"};
        initData[0] = a;
        initData[1] = b;
        initData[2] = c;
        initData[3] = d;
        initData[4] = e;

        PrototypePhone phone = new PrototypePhone(new SmsVO());
        PrototypePhone clone = null;
        for (String[] array : initData) {
            try {
                clone = phone.clone();
                System.out.println(clone.toString());
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            clone.setSendSMSContent(array[0] + array[1] + array[2]);
            clone.sendSms();

        }
    }

    public static void testSecondary(){
        PrototypeAdvanced prototypeAdvanced = new PrototypeAdvanced();
        prototypeAdvanced.setList("克隆[前]设置值[一]");
        PrototypeAdvanced clone = prototypeAdvanced.clone();
        clone.setList("克隆[后]设置值[二]");
        System.out.println(prototypeAdvanced.getList());
    }
}
