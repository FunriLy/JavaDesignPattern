package com.qg.fangrui.JavaDesignPattern.Adapter.extend;

/**
 * 使用委托的适配器：适配器角色
 * Created by FunriLy on 2017/7/6.
 * From small beginnings comes great things.
 */
public class PrintBanner extends Print {

    /**
     * 实现抽象类，将类的具体细则委托给Banner
     */
    private Banner banner;

    public PrintBanner(String message){
        this.banner = new Banner(message);
    }

    public void printWeak() {
        banner.showWithParen();
    }

    public void printStrong() {
        banner.showWithAster();
    }
}
