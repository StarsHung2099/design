package com.design.build.builder;

import com.design.build.domain.CarModel;

import java.util.List;

/**
 * @description: 产品建造类
 * @name: CarBuilder
 * @author: Stars Hung
 * @date: 10:17 2019/5/11
 **/
public interface CarBuilder {

    /**
     * 设置启动顺序
     *
     * @param sequence
     */
    void setSequence(List<String> sequence);

    /**
     * 构造车型
     *
     * @return
     */
    CarModel buildCar();

}
