package com.design.state.context;

/**
 * @description:
 * @name: OpenningState
 * @author: Stars Hung
 * @date: 9:24 2019/5/13
 **/
public class StoppingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {

    }

    @Override
    public void stop() {
        System.out.println("电梯停止了...");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }
}
