package com.qg.fangrui.JavaDesignPattern.singleton;

/**
 * 单例模式：实验固定数量的单例模式
 * Created by FunriLy on 2017/7/8.
 * From small beginnings comes great things.
 */
public class Main {

    public static void main(String[] args) {
        int num = 10;
        for (int i=0; i<num; i++) {
            Singleton3 singleton = Singleton3.getInstance();
            singleton.doSomething();
        }
    }
}
