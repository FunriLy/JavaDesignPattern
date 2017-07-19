package com.qg.fangrui.JavaDesignPattern.strategy;

import java.util.Random;

/**
 * Created by FunriLy on 2017/7/14.
 * From small beginnings comes great things.
 */
public class WinningStrategy implements Strategy {

    private Random random;
    private boolean won = false;
    private Hand preHand;

    public WinningStrategy(int seed){
        random = new Random(seed);
    }


    @Override
    public Hand nextHand() {
        if (!won){
            preHand = Hand.getHand(random.nextInt(3));
        }
        return preHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
