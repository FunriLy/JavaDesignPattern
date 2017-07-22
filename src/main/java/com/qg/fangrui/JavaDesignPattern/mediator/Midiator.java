package com.qg.fangrui.JavaDesignPattern.mediator;

/**
 * 具体的中介者
 * Created by FunriLy on 2017/7/22.
 * From small beginnings comes great things.
 */
public class Midiator {
    PersistentDB persistentDB;
    PersistentFile persistentFile;
    public Midiator setPersistentDB(PersistentDB persistentDB) {
        this.persistentDB = persistentDB;
        return this;
    }
    public Midiator setPersistentFile(PersistentFile persistentFile) {
        this.persistentFile = persistentFile;
        return this;
    }
    public void notifyOther(IPersistent persistent,Object data){
        if(persistent instanceof PersistentDB)
            persistentFile.getData(data);
        if(persistent instanceof PersistentFile)
            persistentDB.getData(data);
    }
}
