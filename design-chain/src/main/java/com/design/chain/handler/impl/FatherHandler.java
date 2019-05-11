package com.design.chain.handler.impl;

import com.design.chain.domain.IWomen;
import com.design.chain.handler.IHandler;

/**
 * @description:
 * @name: FatherHandler
 * @author: Stars Hung
 * @date: 11:45 2019/5/11
 **/
public class FatherHandler extends IHandler {


    public FatherHandler() {
        super(FATHER_LEVEL_REQ);
    }

    @Override
    protected void response(IWomen woman) {
        System.out.println("-----女儿向父亲请示-------");
        System.out.println("女儿的请示是：" + woman.getRequest());
        System.out.println("父亲的答复是：同意");
    }
}
