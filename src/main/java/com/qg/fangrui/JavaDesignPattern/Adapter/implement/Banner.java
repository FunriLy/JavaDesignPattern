package com.qg.fangrui.JavaDesignPattern.Adapter.implement;

/**
 * 使用继承的适配器：实体类
 * Created by FunriLy on 2017/7/6.
 * From small beginnings comes great things.
 */
public class Banner {

    private String message;

    public Banner(String message) {
        this.message = message;
    }

    public void showWithParen(){
        System.out.println("(" + message + ")");
    }

    public void showWithAster(){
        System.out.println("*" + message + "*");
    }
}
