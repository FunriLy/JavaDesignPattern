package com.qg.fangrui.JavaDesignPattern.templatemethod;

/**
 * 模板方法模式：代理子类 1
 * Created by FunriLy on 2017/7/6.
 * From small beginnings comes great things.
 */
public class CharDisplay extends AbstractDisplay {

    private char ch;

    public CharDisplay(char ch){
        this.ch = ch;
    }

    public void open() {
        System.out.print("<<<");
    }

    public void print() {
        System.out.print(ch);
    }

    public void close() {
        System.out.println(">>>");
    }
}
