package com.qg.fangrui.JavaDesignPattern.builder;

/**
 * 建造者模式:建造者
 * Created by FunriLy on 2017/7/9.
 * From small beginnings comes great things.
 */
public abstract class Builder {

    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
