package com.design.state.context;

/**
 * @description:
 * @name: OpenningState
 * @author: Stars Hung
 * @date: 9:24 2019/5/13
 **/
public class RunningState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }

    @Override
    public void run() {
        System.out.println("电梯上下运行....");
    }
}
