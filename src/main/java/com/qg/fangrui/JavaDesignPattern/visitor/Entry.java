package com.qg.fangrui.JavaDesignPattern.visitor;

import java.util.Iterator;

/**
 * Created by FunriLy on 2017/7/19.
 * From small beginnings comes great things.
 */
public abstract class Entry implements Element {

    /**
     * 这里的思路与Composite模式的思路是一致的
     */

    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public Iterator iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
