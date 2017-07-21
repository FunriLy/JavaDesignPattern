package com.qg.fangrui.JavaDesignPattern.facade;

/**
 * 外观模式：测试主类
 * Created by FunriLy on 2017/7/22.
 * From small beginnings comes great things.
 */
public class Main {

    public static void main(String[] args) {
        Object info = ProductSalesman.instance.buy("FunriLy", "世界最好的语言是？", "Github");
        System.out.println(info);
    }
}
