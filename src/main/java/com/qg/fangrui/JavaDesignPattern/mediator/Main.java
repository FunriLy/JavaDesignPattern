package com.qg.fangrui.JavaDesignPattern.mediator;

/**
 * 中介者模式
 * Created by FunriLy on 2017/7/22.
 * From small beginnings comes great things.
 */
public class Main {
    public static void main(String args[]){
        Object data = "数据";
        PersistentDB persistentDB = new PersistentDB();
        PersistentFile persistentFile = new PersistentFile();
        Midiator midiator = new Midiator();
        midiator.setPersistentDB(persistentDB).setPersistentFile(persistentFile);
        persistentDB.getData(data, midiator);
        persistentFile.getData(data, midiator);
    }

}
