package com.design.command.order;

/**
 * @description:
 * @name: AddRequirementCommand
 * @author: Stars Hung
 * @date: 16:30 2019/5/13
 **/
public class DeletePageCommand extends Command {

    @Override
    public void execute() {
        super.pg.find();
        super.pg.delete();
        super.rg.plan();
    }
}
