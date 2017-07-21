package com.qg.fangrui.JavaDesignPattern.facade;

/**
 * 外观模式：获得商品的价格
 * Created by FunriLy on 2017/7/22.
 * From small beginnings comes great things.
 */
public class ProductPrice {

    int getProductPrice(String produce){
        return Math.abs(produce.hashCode());
    }
}
