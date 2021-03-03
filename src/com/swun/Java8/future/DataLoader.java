package com.swun.Java8.future;

import java.util.concurrent.TimeUnit;

/**
 * <p>
 *
 * </p>
 *
 * @author mf
 * @date 2021-03-03 11:40
 */
public interface DataLoader {

    /**
     * 加载数据
     * @return
     */
    String load();

    /**
     * 假装延迟1s
     */
    default void delay()  {
        try {
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
