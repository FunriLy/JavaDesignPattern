package com.qg.fangrui.JavaDesignPattern.bridge;

/**
 * Created by FunriLy on 2017/7/12.
 * From small beginnings comes great things.
 */
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int time){
        open();
        for (int i=0; i<time; i++){
            print();
        }
        close();
    }
}
