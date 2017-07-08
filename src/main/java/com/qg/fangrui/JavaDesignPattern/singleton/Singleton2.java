package com.qg.fangrui.JavaDesignPattern.singleton;

/**
 * 单例模式：懒汉式
 * Created by FunriLy on 2017/7/7.
 * From small beginnings comes great things.
 */
public class Singleton2 {

    //比较懒，在类加载时，不创建实例，因此类加载速度快，但运行时获取对象的速度慢
    private static Singleton2 singleton = null;

    private Singleton2() {

    }

    //synchronized 关键字确保线程安全
    public static synchronized Singleton2 getSingleton(){
        if (null == singleton){
            singleton = new Singleton2();
        }
        return singleton;
    }
}
