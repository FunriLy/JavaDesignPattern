package com.qg.fangrui.JavaDesignPattern.Adapter.implement;

/**
 * 使用继承的适配器：测试程序行为类
 * Created by FunriLy on 2017/7/6.
 * From small beginnings comes great things.
 */
public class Main {

    public static void main(String[] args) {
        Print p = new PrintBanner("hello");
        p.printStrong();
        p.printWeak();
    }
}
