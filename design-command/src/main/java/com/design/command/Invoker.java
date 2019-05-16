package com.design.command;

import com.design.command.order.Command;

/**
 * @description:
 * @name: Invoker
 * @author: Stars Hung
 * @date: 15:58 2019/5/13
 **/
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行客户命令
     */
    public void action() {
        this.command.execute();
    }
}
