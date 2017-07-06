package com.qg.fangrui.JavaDesignPattern.iterator;

/**
 * Iterator 接口类
 * Created by FunriLy on 2017/7/6.
 * From small beginnings comes great things.
 */
public interface MyIterator<T> {

    public abstract boolean hasNext(); //是否有下一个元素
    public abstract T next();           //下一个
    public abstract T remove();         //移除
}
