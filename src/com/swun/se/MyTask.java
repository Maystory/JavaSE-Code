package com.swun.se;

import java.util.concurrent.Callable;

/**
 * Created by Maven on 2018/8/6.
 * Description:
 */
public class MyTask implements Callable {

    private int upperBount;

    public MyTask(int upperBount) {
        this.upperBount = upperBount;
    }

    @Override
    public Object call() throws Exception {
        int sum =0;
        for (int i = 0; i < upperBount; i++) {
            sum+=i;
        }
        return sum;
    }

}