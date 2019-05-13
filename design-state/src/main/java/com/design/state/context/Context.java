package com.design.state.context;

/**
 * @description:
 * @name: Context
 * @author: Stars Hung
 * @date: 9:20 2019/5/13
 **/
public class Context {

    public static final OpenningState openningState = new OpenningState();
    public static final ClosingState closingState = new ClosingState();
    public static final StoppingState stoppingState = new StoppingState();
    public static final RunningState runningState = new RunningState();

    private LiftState liftState;

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public LiftState getLiftState() {
        return liftState;
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }

}
