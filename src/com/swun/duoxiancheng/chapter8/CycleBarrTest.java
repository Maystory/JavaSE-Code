package com.swun.duoxiancheng.chapter8;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CyclicBarrier;

/**
 * 描述:
 *
 * @outhor mf
 * @create 2018-03-22 17:35
 */
public class CycleBarrTest {
    CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

    public static void main(String[] args) {
        Map<Object,Object> map = new HashMap<>();
        String[] strings = {"helo","ewr","wer"};
        map.put("keys",strings);

        String[] keys = (String[])map.get("keys");
        for (String key : keys) {
            System.out.println(key);
        }
    }

}