package com.designpattern.responseChain;

import java.util.Random;

/**
 * <p>
 * 第二个责任处理者
 * </p>
 *
 * @author mf
 * @date 2019-06-28 14:44
 */
public class TwoHandler extends BaseHandler {



    @Override
    void hand(String request) {

        /**
         * <p>
         * 判断是否处理
         * </p>
         *
         * @param
         * @return void see {@link }
         * @author mf
         * @date 2019/6/28 14:45
         */
        Random random = new Random();
        boolean flag = random.nextBoolean();
        if (flag) {
            System.out.println(request);
        } else {
            nextHandler.hand(request);
        }

    }
}
