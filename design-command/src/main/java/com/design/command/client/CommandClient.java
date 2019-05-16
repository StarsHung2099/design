package com.design.command.client;

import com.design.command.organization.Group;
import com.design.command.organization.RequirementGroup;

/**
 * @description:
 * @name: CommandClient
 * @author: Stars Hung
 * @date: 15:53 2019/5/13
 **/
public class CommandClient {

    public static void main(String[] args) {
        Group group = new RequirementGroup();
        group.find();
        group.add();
        group.plan();
    }
}
