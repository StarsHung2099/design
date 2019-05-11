package com.design.build.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @name: CarModel  抽象产品类
 * @author: Stars Hung
 * @date: 10:19 2019/5/11
 **/
public abstract class CarModel {

    private List<String> sequence = new ArrayList<>();

    /**
     * 来，跑起来
     */
    public void run() {
        for (int i = 0; i < this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if ("start".equalsIgnoreCase(actionName)) {
                this.start();
            } else if ("stop".equalsIgnoreCase(actionName)) {
                this.stop();
            } else if ("alarm".equalsIgnoreCase(actionName)) {
                this.alarm();
            } else if ("engine boom".equalsIgnoreCase(actionName)) {
                this.engineBoom();
            }
        }
    }

    /**
     * 设置顺序
     *
     * @param sequence
     */
    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }


    /**
     * 启动
     */
    protected abstract void start();

    /**
     * 熄火
     */
    protected abstract void stop();

    /**
     * 鸣笛
     */
    protected abstract void alarm();

    /**
     * 发动机轰鸣
     */
    protected abstract void engineBoom();

}
