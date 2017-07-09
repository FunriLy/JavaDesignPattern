package com.qg.fangrui.JavaDesignPattern.prototyoe;

/**
 * 产品接口具体的子类
 * Created by FunriLy on 2017/7/8.
 * From small beginnings comes great things.
 */
public class MessageBox implements Product {

    private char decochar;
    public MessageBox(char decochar){
        this.decochar = decochar;
    }

    public void use(String s) {
        int length = s.getBytes().length;
        for (int i=0; i<length+4; i++){
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i=0; i<length+4; i++){
            System.out.print(decochar);
        }
        System.out.println("");
    }

    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
}
