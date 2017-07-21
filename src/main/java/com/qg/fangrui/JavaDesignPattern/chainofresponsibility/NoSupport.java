package com.qg.fangrui.JavaDesignPattern.chainofresponsibility;

/**
 * 永远不解决问题
 * Created by FunriLy on 2017/7/21.
 * From small beginnings comes great things.
 */
public class NoSupport extends Support {

    public NoSupport(String name){
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }

}
