package com.qg.fangrui.JavaDesignPattern.prototyoe;

/**
 * 产品接口的具体实现子类
 * Created by FunriLy on 2017/7/8.
 * From small beginnings comes great things.
 */
public class UnderlinePen implements Product {

    private char ulchar;

    public UnderlinePen(char ulchar){
        this.ulchar = ulchar;
    }

    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print("");
        for (int i=0; i<length; i++){
            System.out.print(ulchar);
        }
        System.out.println("");
    }

    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
}
