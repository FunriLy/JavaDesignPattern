package com.qg.fangrui.JavaDesignPattern.prototyoe;

/**
 * 原型模式
 * Created by FunriLy on 2017/7/9.
 * From small beginnings comes great things.
 */
public class Main {
    public static void main(String[] args) {
        //准备
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("~", upen);
        manager.register("*", mbox);
        manager.register("/", sbox);

        //生成
        Product p1 = manager.create("~");
        p1.use("hello world !");
        Product p2 = manager.create("*");
        p2.use("hello world !");
        Product p3 = manager.create("/");
        p3.use("hello world !");
    }
}
