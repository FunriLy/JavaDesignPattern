package com.qg.fangrui.JavaDesignPattern.chainofresponsibility;

/**
 * 解决奇数编号的问题
 * Created by FunriLy on 2017/7/21.
 * From small beginnings comes great things.
 */
public class OddSupport extends Support {

    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1){
            return true;
        } else {
            return false;
        }
    }
}
