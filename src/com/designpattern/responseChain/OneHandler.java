package com.designpattern.responseChain;

import java.util.Random;

/**
 * <p>
 * 第一个处理者
 * </p>
 *
 * @author mf
 * @date 2019-06-28 14:41
 */
public class OneHandler extends BaseHandler {


    @Override
    void hand(String request) {
        Random random = new Random();
        boolean flag = random.nextBoolean();
        if (flag) {
            System.out.println(request);
        } else {
            nextHandler.hand(request);
        }
    }
}

