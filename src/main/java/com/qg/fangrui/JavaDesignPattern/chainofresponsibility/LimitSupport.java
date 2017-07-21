package com.qg.fangrui.JavaDesignPattern.chainofresponsibility;

/**
 * 解决编号小于limit值的问题
 * Created by FunriLy on 2017/7/21.
 * From small beginnings comes great things.
 */
public class LimitSupport extends Support {

    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit){
            return true;
        } else {
            return false;
        }
    }
}
