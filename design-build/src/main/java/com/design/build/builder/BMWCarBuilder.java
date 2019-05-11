package com.design.build.builder;

import com.design.build.domain.BMWCar;
import com.design.build.domain.CarModel;

import java.util.List;

/**
 * @description: 宝马建造实现类
 * @name: BMWCarBuilder
 * @author: Stars Hung
 * @date: 10:36 2019/5/11
 **/
public class BMWCarBuilder implements CarBuilder {

    private CarModel bmwCar = new BMWCar();

    @Override
    public void setSequence(List<String> sequence) {
        this.bmwCar.setSequence(sequence);
    }

    @Override
    public CarModel buildCar() {
        return this.bmwCar;
    }
}
