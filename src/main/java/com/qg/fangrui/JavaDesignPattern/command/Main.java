package com.qg.fangrui.JavaDesignPattern.command;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by funrily on 17-7-27
 * 命令模式
 * @version 1.0.0
 */
public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {

    public static void main(String[] args) {
        new Main("Command Pattern SamPle");
    }

    //绘制历史记录
    private MacroCommand history = new MacroCommand();
    //绘制区域
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    //删除按钮
    private JButton clearButton = new JButton("clear");

    public Main(String title){
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        show();
    }

    /**
     * ActionListener 接口
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            history.clear();
            canvas.repaint();
        }
    }

    /**
     * MouseMotionListener 接口
     */

    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    /**
     * WindowListener 接口
     */

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
