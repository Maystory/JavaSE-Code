package com.swun.duoxiancheng.queue;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * 描述:
 * ForkJoin 框架的基本使用
 * 计算1+2+3+.....+n
 *
 * @outhor mf
 * @create 2018-03-28 14:23
 */

public class ForkJoinTest extends RecursiveTask<Integer> {
    public static final int THREADHOLD = 2;
    //计算开始值
    public int start;
    //计算结束值
    public int end;

    public ForkJoinTest(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;
        //如果两个数足够小于阈值 直接计算了
        boolean canCompute = end - start <= THREADHOLD;
        if (canCompute) {
            for (int i = start; i <= end; i++) {
                sum = sum + i;
                System.out.println("直接计算了 sum="+sum);
            }
        } else {
            //否则继续切分至阈值
            int middle = (end + start) / 2;
            ForkJoinTest forkJoinTestLeft = new ForkJoinTest(start, middle);
            ForkJoinTest forkJoinTestRight = new ForkJoinTest(middle + 1, end);
            System.out.println("切开了......");
            forkJoinTestLeft.fork();
            forkJoinTestRight.fork();
            Integer left = forkJoinTestLeft.join();
            Integer right = forkJoinTestRight.join();
            sum = left + right;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        //计算1+.......
        ForkJoinTest task = new ForkJoinTest(1, 10);
        ForkJoinTask<Integer> TaskResult = forkJoinPool.submit(task);
        System.out.println(TaskResult.get());

    }
}