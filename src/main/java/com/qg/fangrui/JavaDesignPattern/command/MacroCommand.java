package com.qg.fangrui.JavaDesignPattern.command;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by funrily on 17-7-27
 *
 * @version 1.0.0
 */
public class MacroCommand implements Command {

    private Stack commands = new Stack();

    //执行
    @Override
    public void execute() {
        Iterator it = commands.iterator();
        while (it.hasNext()){
            ((Command)it.next()).execute();
        }
    }
    //添加命令
    public void append(Command cmd){
        if (cmd != this){
            commands.push(cmd);
        }
    }
    //删除最后一条命令
    public void undo(){
        if (!commands.isEmpty()){
            commands.pop();
        }
    }
    //删除所有的命令
    public void clear(){
        commands.clear();
    }
}
