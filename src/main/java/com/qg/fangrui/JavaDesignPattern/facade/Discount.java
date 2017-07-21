package com.qg.fangrui.JavaDesignPattern.facade;

/**
 * 外观模式：计算优惠
 * Created by FunriLy on 2017/7/22.
 * From small beginnings comes great things.
 */
public class Discount {

    int getDiscount(String discountCode){
        return Math.abs(discountCode.hashCode()) % 3;
    }
}
