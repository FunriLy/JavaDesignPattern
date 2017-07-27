package com.qg.fangrui.JavaDesignPattern.command;

import java.awt.*;

/**
 * Created by funrily on 17-7-27
 *
 * @version 1.0.0
 */
public class DrawCanvas extends Canvas implements Drawable {
    //颜色
    private Color color = Color.red;
    //要绘制的圆点半径
    private int radius = 6;
    //命令的历史记录
    private MacroCommand history;
    //构造函数
    public DrawCanvas(int width, int height, MacroCommand history){
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }
    //重新绘制
    public void paint(Graphics g){
        history.execute();
    }

    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x-radius, y-radius, radius*2, radius*2);
    }
}
