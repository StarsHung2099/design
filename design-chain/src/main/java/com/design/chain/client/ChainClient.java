package com.design.chain.client;

import com.design.chain.domain.IWomen;
import com.design.chain.domain.Women;
import com.design.chain.handler.IHandler;
import com.design.chain.handler.impl.FatherHandler;
import com.design.chain.handler.impl.HusbandHandler;
import com.design.chain.handler.impl.SonHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @description:
 * @name: ChainClient
 * @author: Stars Hung
 * @date: 11:49 2019/5/11
 **/
public class ChainClient {

    public static void main(String[] args) {
        Random random = new Random();
        List<IWomen> women = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            women.add(new Women(random.nextInt(4), "我要出去逛街"));
        }

        IHandler father = new FatherHandler();
        IHandler husband = new HusbandHandler();
        IHandler son = new SonHandler();

        father.setNextHandler(husband);
        husband.setNextHandler(son);

        for (IWomen woman : women) {
//            if(0 == woman.getType()){
//                father.handleMessage(woman);
//            }else if(1 == woman.getType()){
//                husband.handleMessage(woman);
//            }else if(2 == woman.getType()){
//                son.handleMessage(woman);
//            }
            father.handleMessage(woman);
        }
    }
}
