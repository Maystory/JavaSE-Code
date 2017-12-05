package com.swun.duoxiancheng.NotifyAndWait;

import com.swun.duoxiancheng.Service1;

/**
 * 描述:
 * 交叉打印 A  B
 *
 * @outhor my
 * @create 2017-12-05 16:39
 */
public class TestDemo1 {
    public static void main(String args[]) {
        DBTools dbTools = new DBTools();
        Thread1[] t1 = new Thread1[10];
        Thread2[] t2 = new Thread2[10];

        for (int i = 0; i < 10; i++) {
            t1[i] = new Thread1(dbTools);
            t2[i] = new Thread2(dbTools);

            t1[i].start();
            t2[i].start();
        }
    }

}