package com.qg.fangrui.JavaDesignPattern.proxy;

/**
 * Created by funrily on 17-7-26
 *
 * @version 1.0.0
 */
public class PrinterProxy implements Printable {

    private String name;
    private Printer real;

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (null != real){
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String str) {
        realize();
        real.print(str);
    }

    private synchronized void realize(){
        if (null == real){
            real = new Printer(name);
        }
    }
}
