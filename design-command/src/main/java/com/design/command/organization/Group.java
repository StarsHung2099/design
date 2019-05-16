package com.design.command.organization;

/**
 * @description:
 * @name: Group
 * @author: Stars Hung
 * @date: 15:40 2019/5/13
 **/
public abstract class Group {

    /**
     * 寻找开会对象
     */
    public abstract  void find();

    /**
     * 要求增加功能
     */
    public abstract void add();

    /**
     * 要求删除功能
     */
    public abstract void delete();

    /**
     * 要求变更需求
     */
    public abstract void change();

    /**
     * 要求给出变更计划
     */
    public abstract void plan();
}
