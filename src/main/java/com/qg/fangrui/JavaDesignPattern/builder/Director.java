package com.qg.fangrui.JavaDesignPattern.builder;

/**
 * 建造者模式：监工
 * Created by FunriLy on 2017/7/9.
 * From small beginnings comes great things.
 */
public class Director {

    private Builder builder;    //实际中传入的是Builder的具体子类

    public Director(Builder builder){
        this.builder = builder;
    }

    public void constrtuct(){
        builder.makeTitle("Greeting");
        builder.makeString("从早上到晚上");
        builder.makeItems(new String[]{
                "早上好",
                "下午好",
        });
        builder.makeTitle("晚上");
        builder.makeItems(new String[]{
                "晚上好",
                "晚安",
                "再见",
        });
        builder.close();
    }
}
