package com.qg.fangrui.JavaDesignPattern.composite;

/**
 * Created by FunriLy on 2017/7/17.
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
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
