package com.design.state.service;

/**
 * @description:
 * @name: ILift
 * @author: Stars Hung
 * @date: 14:22 2019/5/11
 **/
public interface ILift {

    int OPENING_STATE = 0;
    int CLOSING_STATE = 1;
    int RUNNING_STATE = 2;
    int STOPPING_STATE = 3;


    /**
     * 开门
     */
    void open();

    /**
     * 关门
     */
    void close();

    /**
     * 走！运行一个
     */
    void run();

    /**
     * 哦豁，停了
     */
    void stop();

    /**
     * 设置电梯状态
     *
     * @param state
     */
    void setState(int state);
}
