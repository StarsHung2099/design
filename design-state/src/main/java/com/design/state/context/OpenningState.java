package com.design.state.context;

/**
 * @description:
 * @name: OpenningState
 * @author: Stars Hung
 * @date: 9:24 2019/5/13
 **/
public class OpenningState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门开启....");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closingState);
        super.context.getLiftState().close();
    }

    @Override
    public void stop() {

    }

    @Override
    public void run() {

    }
}
