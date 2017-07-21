package com.qg.fangrui.JavaDesignPattern.facade;

/**
 * 外观模式：计算邮费
 * Created by FunriLy on 2017/7/22.
 * From small beginnings comes great things.
 */
public class Postage {

    int getPostage(String addr){
        return Math.abs(addr.hashCode()) % 20 + 6;
    }
}
