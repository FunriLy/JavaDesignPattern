package com.qg.fangrui.JavaDesignPattern.bridge;

/**
 * 桥接模式
 * Created by FunriLy on 2017/7/12.
 * From small beginnings comes great things.
 */
public abstract class DisplayImpl {

    public abstract void rawOpen();
    public abstract void rawPrint();
    public abstract void rawClose();
}
