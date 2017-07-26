package com.qg.fangrui.JavaDesignPattern.command;

/**
 * Created by funrily on 17-7-26
 * 命令模式：新建文件命令
 * @version 1.0.0
 */
public class CommandCreate implements Command {

    MakeFile makeFile;

    public CommandCreate(MakeFile makeFile) {
        this.makeFile = makeFile;
    }

    @Override
    public void execute(String name) throws Exception {
        makeFile.createFile(name);
    }
}
