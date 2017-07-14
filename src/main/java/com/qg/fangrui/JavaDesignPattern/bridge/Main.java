package com.qg.fangrui.JavaDesignPattern.bridge;

/**
 * 桥接模式
 * Created by FunriLy on 2017/7/14.
 * From small beginnings comes great things.
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Chain!"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World!"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe"));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}
