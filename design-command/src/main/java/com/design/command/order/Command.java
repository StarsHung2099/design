package com.design.command.order;

import com.design.command.organization.CodeGroup;
import com.design.command.organization.PageGroup;
import com.design.command.organization.RequirementGroup;

/**
 * @description:
 * @name: Command
 * @author: Stars Hung
 * @date: 16:23 2019/5/13
 **/
public abstract class Command {

    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    /**
     * 只有一个方法，你要我做什么事情
     */
    public abstract void execute();
}
