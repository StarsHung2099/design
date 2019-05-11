package com.design.build.domain;

/**
 * @description: 宝马产品构造类
 * @name: BMWCarBuilder
 * @author: Stars Hung
 * @date: 10:28 2019/5/11
 **/
public class BMWCar extends CarModel {
    @Override
    protected void start() {
        System.out.println("bmw start....");
    }

    @Override
    protected void stop() {
        System.out.println("bmw stop....");
    }

    @Override
    protected void alarm() {
        System.out.println("bmw alarm....");
    }

    @Override
    protected void engineBoom() {
        System.out.println("bmw engine boom....");
    }
}
