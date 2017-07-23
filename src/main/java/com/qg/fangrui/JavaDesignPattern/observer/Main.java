package com.qg.fangrui.JavaDesignPattern.observer;

/**
 * 观察者模式
 * Created by FunriLy on 2017/7/23.
 * From small beginnings comes great things.
 */
public class Main {

    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();    //观察对象=具体的观察对象
        Observer observer1 = new DigitObserver();                   //具体的观察者
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);                           //注册对象
        generator.addObserver(observer2);
        generator.execute();                                        //开启观察
    }
}
