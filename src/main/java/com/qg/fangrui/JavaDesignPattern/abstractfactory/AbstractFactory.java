package com.qg.fangrui.JavaDesignPattern.abstractfactory;

/**
 * 抽象工厂模式
 * Created by FunriLy on 2017/7/10.
 * From small beginnings comes great things.
 */
public class AbstractFactory {

    public static void main(String[] args) {
        IFactory bigfactory = new BigFactory();
        IFactory smallfactory = new SmallFactory();

        bigfactory.productPhone().run();
        bigfactory.productHeadsete().play();

        smallfactory.productPhone().run();
        smallfactory.productHeadsete().play();
    }
}
//抽象产品
interface Headset{
    void play();
}
interface MeizuPhone{
    void run();
}

//具体产品
class PRO5 implements MeizuPhone {
    @Override
    public void run() {
        System.out.println("我是一台PRO5");
    }
}
class MX5 implements MeizuPhone{
    @Override
    public void run() {
        System.out.println("我是一台MX5");
    }
}
class EP21 implements Headset{
    @Override
    public void play() {
        System.out.println("我是一副EP21");
    }
}
class EP30 implements Headset{
    @Override
    public void play() {
        System.out.println("我是一台EP30");
    }
}

//抽象工厂
interface IFactory{
    MeizuPhone productPhone();
    Headset productHeadsete();
}
class BigFactory implements IFactory {
    @Override
    public MeizuPhone productPhone() {
        return new PRO5();
    }
    @Override
    public Headset productHeadsete() {
        return new EP30();
    }
}
class SmallFactory implements IFactory {

    @Override
    public MeizuPhone productPhone() {
        return new MX5();
    }

    @Override
    public Headset productHeadsete() {
        return new EP21();
    }
}