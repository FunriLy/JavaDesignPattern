package com.qg.fangrui.JavaDesignPattern.mediator;

/**
 * Created by FunriLy on 2017/7/22.
 * From small beginnings comes great things.
 */
public interface IPersistent {
    void getData(Object data);
    void getData(Object data, Midiator midiator);
    void saveData();
}
