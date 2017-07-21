package com.qg.fangrui.JavaDesignPattern.chainofresponsibility;

/**
 * 责任链模式
 * Created by FunriLy on 2017/7/21.
 * From small beginnings comes great things.
 */
public class Main {

    public static void main(String[] args) {
        Support alice = new NoSupport("Alice");                 //不解决
        Support bob = new LimitSupport("Bob", 100);             //解决编号小于100的问题
        Support charlie = new SpecialSupport("Charlie", 429);   //解决编号为429的问题
        Support diana = new LimitSupport("Diana", 200);         //解决编号小于200的问题
        Support elmo = new OddSupport("Elmo");                  //解决编号为奇数的问题
        Support fred = new LimitSupport("Fred", 300);           //编号小于300的问题

        //形成责任链
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

        for (int i=0; i<500; i++){
            alice.support(new Trouble(i));
        }
    }
}
