package com.qg.fangrui.JavaDesignPattern.command.simplecommand;

/**
 * Created by funrily on 17-7-26
 * 命令模式：测试主类
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) throws Exception {
        //接收者
        MakeFile makeFile = new MakeFile();
        //命令
        CommandCreate create = new CommandCreate(makeFile);
        CommandDelete delete = new CommandDelete(makeFile);
        //请求者
        Client client = new Client();
        //执行命令
        client.setCommand(create).executeCommand("D://test1.txt");
        client.setCommand(create).executeCommand("D://test2.txt");
        client.setCommand(delete).executeCommand("D://test2.txt");
    }
}
