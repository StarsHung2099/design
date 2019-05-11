package com.design.build.director;

import com.design.build.builder.BMWCarBuilder;
import com.design.build.builder.BenzBuilder;
import com.design.build.builder.CarBuilder;
import com.design.build.domain.BenzCar;
import com.design.build.domain.CarModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 产品导演类，编辑剧本-指定产品特性
 * @name: CarDirector
 * @author: Stars Hung
 * @date: 10:56 2019/5/11
 **/
public class CarDirector {
    private List<String> sequence = new ArrayList<>();
    private CarBuilder benzCarBuilder = new BenzBuilder();
    private CarBuilder bmwCarBuilder = new BMWCarBuilder();

    public CarModel buildBenzCar(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzCarBuilder.setSequence(this.sequence);
        return this.benzCarBuilder.buildCar();
    }

    public CarModel buildBMWCar(){
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwCarBuilder.setSequence(this.sequence);
        return this.bmwCarBuilder.buildCar();
    }
}
