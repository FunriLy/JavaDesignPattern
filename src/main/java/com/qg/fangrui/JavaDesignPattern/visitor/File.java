package com.qg.fangrui.JavaDesignPattern.visitor;

/**
 * Created by FunriLy on 2017/7/19.
 * From small beginnings comes great things.
 */
public class File extends Entry {

    private String name;
    private int size;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }
}
