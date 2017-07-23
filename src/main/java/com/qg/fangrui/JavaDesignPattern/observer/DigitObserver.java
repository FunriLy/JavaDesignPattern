package com.qg.fangrui.JavaDesignPattern.observer;

/**
 * Created by FunriLy on 2017/7/23.
 * From small beginnings comes great things.
 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver : " + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e){

        }
    }
}
