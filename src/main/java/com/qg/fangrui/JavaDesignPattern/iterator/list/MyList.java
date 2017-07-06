package com.qg.fangrui.JavaDesignPattern.iterator.list;

import com.qg.fangrui.JavaDesignPattern.iterator.MyIterator;

/**
 * List集合接口类
 * Created by FunriLy on 2017/7/6.
 * From small beginnings comes great things.
 */
public interface MyList<T> {

    MyIterator<T> iterator();       //返回一个迭代器
    boolean add(T t);               //添加元素
    T get(int index);               //获取索引为index的元素
    T remove();                     //移除最后一个元素
    boolean remove(T t);            //移除指定的元素
    T remove(int index);            //移除指定位置的元素
    boolean set(int index, T t);    //修改指定位置元素
    int size();                     //返回元素容量
}
