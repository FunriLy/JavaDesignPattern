package com.qg.fangrui.JavaDesignPattern.singleton;

/**
 * 单例模式：饿汉式
 * Created by FunriLy on 2017/7/7.
 * From small beginnings comes great things.
 */
public class Singleton1 {

    //在类加载时就完成了初始化，所以类加载较慢，但获取对象的速度快
    private static final Singleton1 SINGLETON = new Singleton1();

    private Singleton1(){

    }

    //获得实例
    public static Singleton1 getSingleton() {
        return SINGLETON;
    }

    public static void doSomething() {

    }


    public static void main(String[] args) {
        System.out.println("开始");
        Singleton1 obj1 = Singleton1.getSingleton();
        Singleton1 obj2 = Singleton1.getSingleton();
        if (obj1 == obj2) {
            System.out.println("obj1 与 obj2 是相同的实例");
        } else {
            System.out.println("obj1 与 obj2 是不同的实例");
        }
        System.out.println("结束");
    }
}
