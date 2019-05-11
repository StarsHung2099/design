package com.design.build.com.design.buld.client;

import com.design.build.builder.BMWCarBuilder;
import com.design.build.builder.CarBuilder;
import com.design.build.director.CarDirector;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @name: CarBuilderClient
 * @author: Stars Hung
 * @date: 10:42 2019/5/11
 **/
public class CarBuilderClient {

    public static void main(String[] args) {
        //无导演模式
        List<String> bmwCarSequence = new ArrayList<>();
        bmwCarSequence.add("engine boom");
        bmwCarSequence.add("stop");
        bmwCarSequence.add("start");
        CarBuilder bmwCarBuilder = new BMWCarBuilder();
        bmwCarBuilder.setSequence(bmwCarSequence);
        bmwCarBuilder.buildCar().run();

        //有导演模式
        CarDirector director = new CarDirector();
        director.buildBenzCar().run();
        director.buildBMWCar().run();
    }
}
