package com.designpattern.responseChain;

/**
 * <p>
 * 基础的责任处理类
 * </p>
 *
 * @author mf
 * @date 2019-06-28 14:39
 */
public abstract class BaseHandler {
    protected BaseHandler nextHandler;


    abstract void hand(String request);

    public BaseHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(BaseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}