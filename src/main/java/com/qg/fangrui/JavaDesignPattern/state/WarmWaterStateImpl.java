package com.qg.fangrui.JavaDesignPattern.state;

/**
 * Created by funrily on 17-7-25
 *
 * @version 1.0.0
 */
public class WarmWaterStateImpl implements IWaterState {
    public void printState() {
        System.out.println("水的状态：温水！");
    }
}
