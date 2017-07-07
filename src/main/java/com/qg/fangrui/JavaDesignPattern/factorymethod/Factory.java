package com.qg.fangrui.JavaDesignPattern.factorymethod;

/**
 * 工厂方法模式：定义了工厂方法的抽象类
 * Created by FunriLy on 2017/7/7.
 * From small beginnings comes great things.
 */
public abstract class Factory {

    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
