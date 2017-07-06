package com.qg.fangrui.JavaDesignPattern.templatemethod;

/**
 * 模板代理类：运行主类
 * Created by FunriLy on 2017/7/6.
 * From small beginnings comes great things.
 */
public class Main {

    public static void main(String[] args){
        //生成一个带有'H'的CharDisplay实例
        AbstractDisplay ch = new CharDisplay('H');

        //生成一个带有"Hello world!"的StringDisplay实例
        AbstractDisplay string = new StringDisplay("Hello world!");

        ch.display();
        string.display();
    }
}
