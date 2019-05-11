package com.design.chain.handler.impl;

import com.design.chain.domain.IWomen;
import com.design.chain.handler.IHandler;

/**
 * @description:
 * @name: FatherHandler
 * @author: Stars Hung
 * @date: 11:45 2019/5/11
 **/
public class HusbandHandler extends IHandler {

    public HusbandHandler() {
        super(HUSBAND_LEVEL_REQ);
    }

    @Override
    protected void response(IWomen woman) {
        System.out.println("-----妻子向丈夫请示-------");
        System.out.println("妻子的请示是：" + woman.getRequest());
        System.out.println("丈夫的答复是：同意");
    }
}
