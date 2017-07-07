package com.qg.fangrui.JavaDesignPattern.factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 * 工厂方法模式：实现工厂抽象类(具体工厂)
 * Created by FunriLy on 2017/7/7.
 * From small beginnings comes great things.
 */
public class IDcardFactory extends Factory {

    private List owner = new ArrayList();

    protected Product createProduct(String owner) {
        return new IDcard(owner);
    }

    protected void registerProduct(Product product) {
        owner.add(((IDcard)product).getOwner());
    }

    public List getOwner() {
        return owner;
    }
}
