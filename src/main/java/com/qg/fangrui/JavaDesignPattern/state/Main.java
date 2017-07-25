package com.qg.fangrui.JavaDesignPattern.state;

/**
 * Created by funrily on 17-7-25
 * 状态模式：测试主类
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        IWaterState state = null;
        for (int i=0; i<3; i++){
            try {
                WaterContext context = new WaterContext();
                context.setState(i);
                state = context.getState();
                state.printState();
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
