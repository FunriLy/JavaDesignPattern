package com.qg.fangrui.JavaDesignPattern.decorator;

/**
 * Created by FunriLy on 2017/7/17.
 * From small beginnings comes great things.
 */
public abstract class Border extends Display {
    protected Display display;
    protected Border(Display display){
        this.display = display;
    }
}
