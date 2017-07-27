package com.qg.fangrui.JavaDesignPattern.command;

import java.awt.*;

/**
 * Created by funrily on 17-7-27
 *
 * @version 1.0.0
 */
public class DrawCommand implements Command {
    //绘制对象
    protected Drawable drawable;
    //绘制位置
    private Point point;
    //构造函数
    public DrawCommand(Drawable drawable, Point point) {
        this.drawable = drawable;
        this.point = point;
    }
    //执行
    @Override
    public void execute() {
        drawable.draw(point.x, point.y);
    }
}
