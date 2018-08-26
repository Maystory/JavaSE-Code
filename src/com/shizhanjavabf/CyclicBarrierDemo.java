package com.shizhanjavabf;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by Maven on 2018/8/26.
 * Description:
 * <p>
 * 使用了两次栅栏
 * 集合队伍准备：
 * 士兵7:停顿准备：。。。
 * 士兵8:停顿准备：。。。
 * 士兵2:停顿准备：。。。
 * 士兵0:停顿准备：。。。
 * 士兵4:停顿准备：。。。
 * 士兵9:停顿准备：。。。
 * 士兵6:停顿准备：。。。
 * 士兵1:停顿准备：。。。
 * 士兵3:停顿准备：。。。
 * 士兵5:停顿准备：。。。
 * 10:集合完毕
 * 士兵6:the work is finished ....
 * 士兵9:the work is finished ....
 * 士兵5:the work is finished ....
 * 士兵7:the work is finished ....
 * 士兵4:the work is finished ....
 * 士兵0:the work is finished ....
 * 士兵1:the work is finished ....
 * 士兵3:the work is finished ....
 * 士兵2:the work is finished ....
 * 士兵8:the work is finished ....
 * 士兵：10：个任务完成
 */
public class CyclicBarrierDemo {

    public static class Soldier implements Runnable {
        private String soldier;
        private final CyclicBarrier cyclicBarrier;

        public Soldier(String soldier, CyclicBarrier cyclicBarrier) {
            this.soldier = soldier;
            this.cyclicBarrier = cyclicBarrier;
        }


        @Override
        public void run() {

            try {
                /**
                 * 所有的线程到达此处开始停顿
                 */
                Thread.sleep(Math.abs(new Random().nextInt() % 10000));
                System.out.println(soldier + ":停顿准备：。。。");
                cyclicBarrier.await();

                dowork();
                //同理
                cyclicBarrier.await();

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }

        }

        void dowork() throws InterruptedException {
            Thread.sleep(Math.abs(new Random().nextInt() % 10000));
            System.out.println(soldier + ":the work is finished ....");

        }
    }

    public static class BarrierRun implements Runnable {
        boolean flag;
        int N;

        public BarrierRun(boolean flag, int n) {
            this.flag = flag;
            this.N = n;
        }


        @Override
        public void run() {

            if (flag) {
                System.out.println("士兵：" + N + "：个任务完成");
            } else {
                System.out.println(N + ":集合完毕");
                flag = true;
            }

        }
    }

    public static void main(String[] args) {
        final int N = 10;
        Thread[] allSoldiers = new Thread[N];
        boolean flag = false;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(N, new BarrierRun(flag, N));
        System.out.println("集合队伍准备：");

        for (int i = 0; i < N; i++) {
            allSoldiers[i] = new Thread(new Soldier("士兵" + i, cyclicBarrier));
            allSoldiers[i].start();

        }
    }

}