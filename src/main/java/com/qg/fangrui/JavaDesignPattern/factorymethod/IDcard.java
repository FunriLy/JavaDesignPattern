package com.qg.fangrui.JavaDesignPattern.factorymethod;

/**
 * 工厂方法模式：实现产品抽象类
 * Created by FunriLy on 2017/7/7.
 * From small beginnings comes great things.
 */
public class IDcard extends Product {

    private String owner;

    public IDcard(String owner){
        System.out.println("IDcard : " + owner);
        this.owner = owner;
    }

    public void user() {
        System.out.println("using " + owner);
    }

    public String getOwner(){
        return owner;
    }
}
