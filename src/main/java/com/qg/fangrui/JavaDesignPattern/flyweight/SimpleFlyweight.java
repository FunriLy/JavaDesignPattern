package com.qg.fangrui.JavaDesignPattern.flyweight;

import java.util.HashMap;

/**
 * Created by funrily on 17-7-26
 * 简单享元模式
 * @version 1.0.0
 */
public class SimpleFlyweight {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        IFlyweight flyweight1, flyweight2, flyweight3, flyweight4;
        flyweight1 = factory.getFlyweight("A");
        flyweight2 = factory.getFlyweight("B");
        flyweight3 = factory.getFlyweight("A");
        flyweight4 = factory.getFlyweight("C");

        flyweight1.dosomething();
        flyweight2.dosomething();
        flyweight3.dosomething();
        flyweight4.dosomething();
        System.out.println("Size : " + factory.size());
    }
}
//享元接口
interface IFlyweight {
    void dosomething();
}
//具体享元
class Flyweight implements IFlyweight {

    private String value;
    public Flyweight(String value) {
        this.value = value;
    }
    @Override
    public void dosomething() {
        System.out.println(value);
    }
}
//享元工厂
class FlyweightFactory{
    //缓存空间
    HashMap<String, IFlyweight> flyweightMap = new HashMap<>();
    //获得实例
    IFlyweight getFlyweight(String value){
        IFlyweight flyweight = flyweightMap.get(value);
        //检查缓存中是否存在
        if (null == flyweight){
            flyweight = new Flyweight(value);
            flyweightMap.put(value, flyweight);
        }
        return flyweight;
    }
    public int size(){
        return flyweightMap.size();
    }
}
