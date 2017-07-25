package com.qg.fangrui.JavaDesignPattern.state;

/**
 * Created by funrily on 17-7-25
 * 状态模式
 * @version 1.0.0
 */
public class WaterContext {
    //状态对象
    private IWaterState state = null;

    /**
     * 设置状态对象
     * @param i
     */
    public void setState(int i){
        if (i == 0){
            state = new IceWaterStateImpl();
            System.out.println("正在加热……");
        } else if (i == 1){
            state = new WarmWaterStateImpl();
            System.out.println("正在加热……");
        } else if (i == 2){
            state = new WasteWaterStateImpl();
            System.out.println("加热完毕！");
        }
    }

    /**
     * 获得当前状态对象
     * @return
     */
    public IWaterState getState(){
        return state;
    }
}
