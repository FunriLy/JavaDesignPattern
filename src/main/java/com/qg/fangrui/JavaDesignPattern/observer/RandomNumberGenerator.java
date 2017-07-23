package com.qg.fangrui.JavaDesignPattern.observer;

import java.util.Random;

/**
 * 观察者模式：生成随机数的类
 * Created by FunriLy on 2017/7/23.
 * From small beginnings comes great things.
 */
public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random();
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for(int i=0; i<20; i++) {
            number = random.nextInt(50);
            notifyObserver();
        }
    }
}
