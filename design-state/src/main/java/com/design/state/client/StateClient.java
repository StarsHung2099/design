package com.design.state.client;

import com.design.state.context.Context;

/**
 * @description:
 * @name: StateClient
 * @author: Stars Hung
 * @date: 14:31 2019/5/11
 **/
public class StateClient {

    public static void main(String[] args) {
//        ILift lift = new Lift();
//        lift.setState(ILift.STOPPING_STATE);
//        lift.open();
//        lift.close();
//        lift.run();
//        lift.stop();

        Context context = new Context();
        context.setLiftState(Context.closingState);
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
