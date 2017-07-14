package com.qg.fangrui.JavaDesignPattern.bridge;

/**
 * 桥接模式
 * Created by FunriLy on 2017/7/12.
 * From small beginnings comes great things.
 */
public class Display {

    private DisplayImpl impl;

    public Display(DisplayImpl impl){
        this.impl = impl;
    }

    public void open(){
        impl.rawOpen();
    }
    public void print(){
        impl.rawPrint();
    }
    public void close(){
        impl.rawClose();
    }

    public final void display(){
        open();
        print();
        close();
    }
}
