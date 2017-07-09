package com.qg.fangrui.JavaDesignPattern.builder;

/**
 * 建造者模式：具体的建造者
 * Created by FunriLy on 2017/7/9.
 * From small beginnings comes great things.
 */
public class TextBuilder extends Builder {

    private StringBuffer buffer = new StringBuffer();

    public void makeTitle(String title) {
        buffer.append("======================\n");
        buffer.append("[" + title + "]\n");
        buffer.append("\n");
    }

    public void makeString(String str) {
        buffer.append('#' + str + "\n");
        buffer.append("\n");
    }

    public void makeItems(String[] items) {
        for (int i=0; i<items.length; i++){
            buffer.append("  · " + items[i] + "\n");
        }
        buffer.append("\n");
    }

    public void close() {
        buffer.append("======================\n");
    }

    public String getResult(){
        return buffer.toString();
    }
}
