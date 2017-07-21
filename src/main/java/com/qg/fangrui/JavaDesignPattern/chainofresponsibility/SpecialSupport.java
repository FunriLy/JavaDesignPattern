package com.qg.fangrui.JavaDesignPattern.chainofresponsibility;

/**
 * 解决特定编号的问题
 * Created by FunriLy on 2017/7/21.
 * From small beginnings comes great things.
 */
public class SpecialSupport extends Support {

    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number){
            return true;
        } else {
            return false;
        }
    }
}
