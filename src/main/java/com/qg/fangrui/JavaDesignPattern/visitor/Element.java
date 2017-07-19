package com.qg.fangrui.JavaDesignPattern.visitor;

/**
 * Created by FunriLy on 2017/7/19.
 * From small beginnings comes great things.
 */
public interface Element {
    /**
     * 表示接受访问者的访问接口
     */
    public abstract void accept(Visitor v);
}
