package com.shizhanjavabf;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Maven on 2018/8/27.
 * Description:
 */
public class ScheduleExcuterServiceDemo {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
        scheduledExecutorService.scheduleWithFixedDelay(() -> {
            try {
                Thread.sleep(6000);
                System.out.println(Thread.currentThread().getName()+":"+System.currentTimeMillis()/1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }, 0, 2, TimeUnit.SECONDS);
    }
}