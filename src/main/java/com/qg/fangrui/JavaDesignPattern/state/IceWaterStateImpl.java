package com.qg.fangrui.JavaDesignPattern.state;

/**
 * 冰水状态实现类
 * Created by funrily on 17-7-25
 * @version 1.0.0
 */
public class IceWaterStateImpl implements IWaterState {
    public void printState() {
        System.out.println("水的状态：冰水！");
    }
}
