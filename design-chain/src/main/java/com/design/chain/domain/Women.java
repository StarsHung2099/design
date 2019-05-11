package com.design.chain.domain;

/**
 * @description:
 * @name: Women
 * @author: Stars Hung
 * @date: 11:38 2019/5/11
 **/
public class Women implements IWomen {
    /**
     * 女性婚姻状况：0--未婚，1--已婚，2--丧偶
     */
    private int type = 0;

    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        this.request = request;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
