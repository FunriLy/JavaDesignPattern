package com.qg.fangrui.JavaDesignPattern.command.simplecommand;

/**
 * Created by funrily on 17-7-26
 *
 * @version 1.0.0
 */
public class Client {
    Command command;
    public Client setCommand(Command command){
        this.command = command;
        return this;
    }
    public void executeCommand(String name) throws Exception {
        if (command == null){
            throw new Exception("命令不能为空！");
        }
        command.execute(name);
    }
}
