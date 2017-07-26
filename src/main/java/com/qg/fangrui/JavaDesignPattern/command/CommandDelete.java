package com.qg.fangrui.JavaDesignPattern.command;

/**
 * Created by funrily on 17-7-26
 * 命令模式：删除文件命令
 * @version 1.0.0
 */
public class CommandDelete implements Command {

    MakeFile makeFile;

    public CommandDelete(MakeFile makeFile) {
        this.makeFile = makeFile;
    }

    @Override
    public void execute(String name) throws Exception {
        makeFile.deleteFile(name);
    }
}
