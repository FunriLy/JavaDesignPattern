package com.qg.fangrui.JavaDesignPattern.chainofresponsibility;

/**
 * 责任链模式：表示解決问题的抽象类
 * Created by FunriLy on 2017/7/20.
 * From small beginnings comes great things.
 */
public abstract class Support {

    private String name;        //解决问题实例的名字
    private Support next;       //要推卸给的对象

    public Support(String name){
        this.name = name;
    }

    public Support setNext(Support next){
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble) {    //解决问题的步骤
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null){
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    public String toString(){
        return "[" + name + "]";
    }

    //解决问题的方法
    protected abstract boolean resolve(Trouble trouble);

    //解决
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    //未解决
    protected void fail(Trouble trouble){
        System.out.println(trouble + " cannot be resolved.");
    }
}
