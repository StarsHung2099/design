package com.design.state.service.impl;

import com.design.state.service.ILift;

/**
 * @description:
 * @name: Lift
 * @author: Stars Hung
 * @date: 14:29 2019/5/11
 **/
public class Lift implements ILift {
    private int state;

    @Override
    public void open() {
        switch (this.state) {
            case CLOSING_STATE:
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
            case STOPPING_STATE:
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
            default:
                break;
        }
    }

    @Override
    public void close() {
        switch (this.state) {
            case OPENING_STATE:
                this.closeWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            default:
                break;
        }
    }

    @Override
    public void run() {
        switch (this.state) {
            case CLOSING_STATE:
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
            case STOPPING_STATE:
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
            default:
                break;
        }
    }

    @Override
    public void stop() {
        switch (this.state) {
            case CLOSING_STATE:
                this.stopWithoutLogic();
                this.setState(STOPPING_STATE);
                break;
            case RUNNING_STATE:
                this.stopWithoutLogic();
                this.setState(STOPPING_STATE);
                break;
            default:
                break;
        }
    }

    @Override
    public void setState(int state) {
        this.state = state;
    }

    private void openWithoutLogic() {
        System.out.println("电梯开门...");
    }

    private void closeWithoutLogic() {
        System.out.println("电梯关门...");
    }

    private void runWithoutLogic() {
        System.out.println("电梯上下运行起来了...");
    }

    private void stopWithoutLogic() {
        System.out.println("电梯停止了...");
    }
}
