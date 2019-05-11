package com.design.chain.domain;

/**
 * @description:
 * @name: IWomen
 * @author: Stars Hung
 * @date: 11:36 2019/5/11
 **/
public interface IWomen {
    /**
     * 获取女性婚姻状态
     * @return
     */
    int getType();

    /**
     * 获取女性请求信息
     * @return
     */
    String getRequest();
}
