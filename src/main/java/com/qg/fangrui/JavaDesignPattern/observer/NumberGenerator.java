package com.qg.fangrui.JavaDesignPattern.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 观察者模式：生成数值对象的接口类
 * Created by FunriLy on 2017/7/23.
 * From small beginnings comes great things.
 */
public abstract class NumberGenerator {

    private ArrayList observerList = new ArrayList();

    public void addObserver(Observer observer){         //注册Observer
        observerList.add(observer);
    }

    public void deleteObserver(Observer observer){      //删除Observer
        observerList.remove(observer);
    }

    public void notifyObserver(){                       //向Observer发送通知
        Iterator iterator = observerList.iterator();
        while (iterator.hasNext()) {
            Observer o = (Observer) iterator.next();
            o.update(this); //调用每个Observer的update()方法
        }
    }

    public abstract int getNumber();    //获取数据
    public abstract void execute();     //生成数据
}
