package com.qg.fangrui.JavaDesignPattern.factorymethod;

/**
 * 工厂方法模式：测试主类
 * Created by FunriLy on 2017/7/7.
 * From small beginnings comes great things.
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = new IDcardFactory();
        Product card1 = factory.create("'test1");
        Product card2 = factory.create("'test2");
        Product card3 = factory.create("'test3");
        card1.user();
        card2.user();
        card3.user();
    }
}
