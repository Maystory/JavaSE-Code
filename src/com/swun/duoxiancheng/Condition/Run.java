package com.swun.duoxiancheng.Condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 描述:
 * 连续按顺序打印ABC
 *
 * @outhor my
 * @create 2017-12-05 16:11
 */
public class Run {
    volatile private static int nextPrint = 1;
    private static volatile ReentrantLock lock = new ReentrantLock();
    final private static Condition conditonA = lock.newCondition();
    final private static Condition conditonB = lock.newCondition();
    final private static Condition conditonC = lock.newCondition();

    @SuppressWarnings("all")
    public static void main(String args[]) throws Exception {
        Thread threadA = new Thread() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrint != 1) {

                        conditonA.await();
                    }

                        System.out.println("threadA -------------->");


                    nextPrint = 2;
                    conditonB.signal();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }


            }

        };
        //////////
        Thread threadB = new Thread() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrint != 2) {

                        conditonB.await();
                    }

                        System.out.println("threadB------>" );


                    nextPrint = 3;
                    conditonC.signal();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }


            }

        };
        ///
        Thread threadC = new Thread() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrint != 3) {

                        conditonC.await();
                    }
                        System.out.println("threadC ---------------------------------------->" );


                    nextPrint = 1;
                    conditonA.signal();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();


                }
            }

        };

        Thread[] aArrays = new Thread[3];
        Thread[] bArrays = new Thread[3];
        Thread[] cArrays = new Thread[3];


        for (int i = 0; i < 3; i++) {
            aArrays[i] = new Thread(threadA);
            bArrays[i] = new Thread(threadB);
            cArrays[i] = new Thread(threadC);

            aArrays[i].start();
            bArrays[i].start();
            cArrays[i].start();
        }

    }
}