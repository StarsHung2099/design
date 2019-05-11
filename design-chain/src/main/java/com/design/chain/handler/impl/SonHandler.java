package com.design.chain.handler.impl;

import com.design.chain.domain.IWomen;
import com.design.chain.handler.IHandler;

/**
 * @description:
 * @name: FatherHandler
 * @author: Stars Hung
 * @date: 11:45 2019/5/11
 **/
public class SonHandler extends IHandler {

    public SonHandler() {
        super(SON_LEVEL_REQ);
    }

    @Override
    protected void response(IWomen woman) {
        System.out.println("-----母亲向儿子请示-------");
        System.out.println("母亲的请示是：" + woman.getRequest());
        System.out.println("儿子的答复是：同意");
    }
}
