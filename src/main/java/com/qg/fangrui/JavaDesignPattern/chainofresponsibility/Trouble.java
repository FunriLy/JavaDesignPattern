package com.qg.fangrui.JavaDesignPattern.chainofresponsibility;

/**
 * 责任链模式:表示发生问题的实例
 * Created by FunriLy on 2017/7/20.
 * From small beginnings comes great things.
 */
public class Trouble {

    private int number;     //问题编号
    public Trouble(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public String toString(){
        return "[Trouble " + number + "]";
    }
}
