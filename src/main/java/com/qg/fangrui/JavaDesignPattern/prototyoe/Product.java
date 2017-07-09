package com.qg.fangrui.JavaDesignPattern.prototyoe;

/**
 * 复制模式：抽象接口
 * Created by FunriLy on 2017/7/8.
 * From small beginnings comes great things.
 */
public interface Product extends Cloneable {

    public abstract void use(String s);
    public abstract Product createClone();
}
