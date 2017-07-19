package com.qg.fangrui.JavaDesignPattern.decorator;

/**
 * 装饰器1
 * Created by FunriLy on 2017/7/17.
 * From small beginnings comes great things.
 */
public class SideBorder extends Border {

    private char brorderChar;

    protected SideBorder(Display display, char brorderChar) {
        super(display);
        this.brorderChar = brorderChar;
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return brorderChar + display.getRowText(row) + brorderChar;
    }
}
