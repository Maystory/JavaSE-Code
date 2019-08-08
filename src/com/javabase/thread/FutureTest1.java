package com.javabase.thread;

import java.util.concurrent.*;

/**
 * <p>
 * threadTest
 * </p>
 *
 * @author mf
 * @date 2019-07-19 17:34
 */
public class FutureTest1 {

    public static void main(String[] args) throws Exception {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        Future<Integer> result = scheduledExecutorService.submit(new SumTask());
        //这个get会阻塞
        Integer integer = result.get();
        System.out.println(integer);
    }


  static   class SumTask implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            Thread.sleep(5000);
            return 1+2+3+4;
        }
    }
}

