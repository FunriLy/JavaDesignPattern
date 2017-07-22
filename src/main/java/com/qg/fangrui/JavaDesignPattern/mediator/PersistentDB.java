package com.qg.fangrui.JavaDesignPattern.mediator;

/**
 * 具体的同事2
 * Created by FunriLy on 2017/7/22.
 * From small beginnings comes great things.
 */
public class PersistentDB implements IPersistent{
    private Object data;
    @Override
    public void getData(Object data, Midiator midiator) {
        getData(data);
        midiator.notifyOther(this, data);
    }
    @Override
    public void saveData() {
        System.out.println(data + " 已保存到数据库");
    }
    @Override
    public void getData(Object data) {
        this.data = data;
        saveData();
    }
}
