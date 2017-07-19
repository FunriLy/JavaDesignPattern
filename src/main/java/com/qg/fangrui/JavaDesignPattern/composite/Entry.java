package com.qg.fangrui.JavaDesignPattern.composite;

/**
 * Created by FunriLy on 2017/7/17.
 * From small beginnings comes great things.
 */
public abstract class Entry {

    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void printList(){
        printList("");
    }

    protected abstract void printList(String prefix);

    public String toString(){
        return getName() + "(" + getSize() + ")";
    }
}