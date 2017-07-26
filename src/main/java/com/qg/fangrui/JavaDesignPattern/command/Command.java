package com.qg.fangrui.JavaDesignPattern.command;

/**
 * Created by funrily on 17-7-26
 * 命令模式：命令接口
 * @version 1.0.0
 */
public interface Command {
    void execute(String name) throws Exception;
}
