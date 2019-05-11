package com.design.build.builder;

import com.design.build.domain.BenzCar;
import com.design.build.domain.CarModel;

import java.util.List;

/**
 * @description: 奔驰建造实现类
 * @name: BenzBuilder
 * @author: Stars Hung
 * @date: 10:33 2019/5/11
 **/
public class BenzBuilder implements CarBuilder {

    private CarModel benzCar = new BenzCar();

    @Override
    public void setSequence(List<String> sequence) {
        this.benzCar.setSequence(sequence);
    }

    @Override
    public CarModel buildCar() {
        return this.benzCar;
    }
}
