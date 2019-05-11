package com.design.chain.handler;

import com.design.chain.domain.IWomen;

/**
 * @description:
 * @name: IHandler
 * @author: Stars Hung
 * @date: 11:37 2019/5/11
 **/
public abstract class IHandler {
    protected static final int FATHER_LEVEL_REQ = 0;
    protected static final int HUSBAND_LEVEL_REQ = 1;
    protected static final int SON_LEVEL_REQ = 2;

    private int level = 0;
    private IHandler nextHandler;

    public IHandler(int level) {
        this.level = level;
    }

    /**
     * 处理女性的请求
     *
     * @param woman
     */
    public void handleMessage(IWomen woman) {
        if(this.level == woman.getType()){
            this.response(woman);
        }else{
            if(null != this.nextHandler){
                this.nextHandler.handleMessage(woman);
            }else{
                System.out.println("---没地方请示了，按不同意见处理咯");
            }
        }
    }

    /**
     * 响应女性的请求
     *
     * @param woman
     */
    protected abstract void response(IWomen woman);

    public void setNextHandler(IHandler handler) {
        this.nextHandler = handler;
    }

}
