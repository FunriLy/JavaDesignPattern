package com.qg.fangrui.JavaDesignPattern.singleton;

import java.util.ArrayList;
import java.util.Random;

/**
 * 单例模式：固定数量的单例
 * Created by FunriLy on 2017/7/7.
 * From small beginnings comes great things.
 */
public class Singleton3 {
    //定义最多能产生的实例数量
    private static int maxNumOfSingleton = 3;
    //每个对象的私有属性列表
    private static ArrayList<String> nameList = new ArrayList<String>();
    //实例列表
    private static ArrayList<Singleton3> singletonList = new ArrayList<Singleton3>();
    //当前单例的序列号
    private static int countNumOfSingleton = 0;

    //产生所有对象
    static {
        for (int i=0; i<maxNumOfSingleton; i++){
            singletonList.add(new Singleton3("第" + i + "个实例对象"));
        }
    }

    private Singleton3(){}

    //实例构造器
    private Singleton3(String name) {
        nameList.add(name);
    }

    //随机获得实例对象
    public static Singleton3 getInstance() {
        Random random = new Random();
        //随机获取实例序列号并更新
        countNumOfSingleton = random.nextInt(maxNumOfSingleton);
        return singletonList.get(countNumOfSingleton);
    }

    public void doSomething (){
        System.out.println(nameList.get(countNumOfSingleton));
    }
}
