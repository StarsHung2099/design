package com.design.command.order;

/**
 * @description:
 * @name: AddRequirementCommand
 * @author: Stars Hung
 * @date: 16:30 2019/5/13
 **/
public class AddRequirementCommand extends Command {

    @Override
    public void execute() {
        super.rg.find();
        super.rg.add();
        super.rg.plan();
    }
}
