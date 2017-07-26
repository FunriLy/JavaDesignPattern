package com.qg.fangrui.JavaDesignPattern.proxy;

/**
 * Created by funrily on 17-7-26
 * 代理模式
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("现在的名字是" + p.getPrinterName() + "。");
        p.setPrinterName("Bob");
        System.out.println("现在的名字是" + p.getPrinterName() + "。");
        p.print("Hello, world!");
    }
}
