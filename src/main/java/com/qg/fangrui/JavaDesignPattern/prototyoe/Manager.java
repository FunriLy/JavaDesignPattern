package com.qg.fangrui.JavaDesignPattern.prototyoe;

import java.util.HashMap;

/**
 * Created by FunriLy on 2017/7/8.
 * From small beginnings comes great things.
 */
public class Manager {

    private HashMap showcase = new HashMap();

    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String photoname){
        Product product = (Product) showcase.get(photoname);
        return product.createClone();
    }
}
