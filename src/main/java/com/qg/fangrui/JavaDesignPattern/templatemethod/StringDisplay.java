package com.qg.fangrui.JavaDesignPattern.templatemethod;

/**
 * 模板方法模式：代理子类 2
 * Created by FunriLy on 2017/7/6.
 * From small beginnings comes great things.
 */
public class StringDisplay extends AbstractDisplay {

    private String string;  //字符串
    private int width;      //字符串的字节长度

    public StringDisplay(String string){
        this.string = string;
        this.width = string.getBytes().length;
    }

    public void open() {
        printLine();
    }

    public void print() {
        System.out.println("|" + string + "|");
    }

    public void close() {
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for (int i=0; i<width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
