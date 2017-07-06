package com.qg.fangrui.JavaDesignPattern.templatemethod;

/**
 * 模板方法模式：抽象类
 * Created by FunriLy on 2017/7/6.
 * From small beginnings comes great things.
 */
public abstract class AbstractDisplay {

    //交给子类实现的抽象方法
    public abstract void open();
    public abstract void print();
    public abstract void close();

    //本抽象类中实现的方法
    public final void display() {
        open();
        for (int i=0; i<5; i++){
            print();
        }
        close();
    }
}
