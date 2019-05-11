package com.design.build.domain;

/**
 * @description: 奔驰产品构造类
 * @name: BenzCar
 * @author: Stars Hung
 * @date: 10:27 2019/5/11
 **/
public class BenzCar extends CarModel {

    @Override
    protected void start() {
        System.out.println("benz start....");
    }

    @Override
    protected void stop() {
        System.out.println("benz stop....");
    }

    @Override
    protected void alarm() {
        System.out.println("benz alarm....");
    }

    @Override
    protected void engineBoom() {
        System.out.println("benz engine boom....");
    }
}
