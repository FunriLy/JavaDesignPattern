package com.qg.fangrui.JavaDesignPattern.strategy;

/**
 * Created by FunriLy on 2017/7/14.
 * From small beginnings comes great things.
 */
public interface Strategy {

    public abstract  Hand nextHand();
    public abstract void study(boolean win);
}
