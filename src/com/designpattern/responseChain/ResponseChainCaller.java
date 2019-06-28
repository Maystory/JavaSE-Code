package com.designpattern.responseChain;

/**
 * <p>
 * 外部调用者
 * </p>
 *
 * @author mf
 * @date 2019-06-28 14:46
 */
public class ResponseChainCaller {

    public static void main(String[] args) {
        OneHandler oneHandler = new OneHandler();

        TwoHandler twoHandler = new TwoHandler();

        oneHandler.setNextHandler(twoHandler);




    }
}
