package com.swun.se;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Maven on 2018/8/6.
 * Description:
 */
public class CallableDemo {
    public static void main(String[] args)throws Exception {
        List<Future<Integer>> list = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            list.add(executorService.submit(new MyTask((int)(Math.random()*100))));
        }
        int sum =0;
        for (Future<Integer> integerFuture : list) {
            while (!integerFuture.isDone()){
                sum+=integerFuture.get();
            }
        }
        System.out.println(sum);

    }
}