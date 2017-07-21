package com.qg.fangrui.JavaDesignPattern.facade;

import java.util.Random;

/**
 * 外观模式：库存子系统
 * Created by FunriLy on 2017/7/22.
 * From small beginnings comes great things.
 */
public class Stock {

    boolean hasStock(String product) {
        return new Random().nextInt(Math.abs(product.hashCode())) > 0;
    }
}
