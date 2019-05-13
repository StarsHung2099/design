package com.design.state.context;

/**
 * @description:
 * @name: LiftState
 * @author: Stars Hung
 * @date: 9:21 2019/5/13
 **/
public abstract class LiftState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void stop();

    public abstract void run();
}
