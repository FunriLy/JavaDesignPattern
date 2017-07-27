package com.qg.fangrui.JavaDesignPattern.command.simplecommand;

import java.io.File;
import java.io.IOException;

/**
 * Created by funrily on 17-7-26
 * 命令模式：接收者
 * @version 1.0.0
 */
public class MakeFile {
    //创建文件
    public void createFile(String name) throws IOException {
        File file = new File(name);
        file.createNewFile();
    }
    //删除文件
    public boolean deleteFile(String name){
        File file = new File(name);
        if (file.exists() && file.isFile()){
            file.delete();
            return true;
        }
        return false;
    }
}
