package com.qg.fangrui.JavaDesignPattern.Adapter.implement;

/**
 * 使用继承的适配器：适配器类
 * Created by FunriLy on 2017/7/6.
 * From small beginnings comes great things.
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String message) {
        super(message);
    }

    public void printWeak() {
        showWithParen();
    }

    public void printStrong() {
        showWithAster();
    }
}
