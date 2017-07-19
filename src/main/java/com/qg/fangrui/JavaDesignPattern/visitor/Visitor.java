package com.qg.fangrui.JavaDesignPattern.visitor;

/**
 * Created by FunriLy on 2017/7/19.
 * From small beginnings comes great things.
 */
public abstract class Visitor {

    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
