package com.qg.fangrui.JavaDesignPattern.proxy;

/**
 * Created by funrily on 17-7-26
 * 代理模式：共同接口
 * @version 1.0.0
 */
public interface Printable {
    //设置名字
    public abstract void setPrinterName(String name);
    //获取名字
    public abstract String getPrinterName();
    //打印输出
    public abstract void print(String str);
}
