package com.simpletour.java8.dateapi;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <p>
 *
 * </p>
 *
 * @author mf
 * @date 2019-09-27 09:53
 */
public class DateApiTest {


    public static void main(String[] args) {

        final Semaphore semaphore = new Semaphore(1);
        AtomicReference<String> reference = new AtomicReference<>("A");

        PrintTask p1 = new PrintTask();
        p1.setReference(reference);
        p1.setSemaphore(semaphore);

        PrintTask p2 = new PrintTask();
        p2.setSemaphore(semaphore);
        p2.setReference(reference);

        PrintTask p3 = new PrintTask();
        p3.setSemaphore(semaphore);
        p3.setReference(reference);


        Thread t1 = new Thread(p1);
        t1.setName("A");
        t1.start();


        Thread t2 = new Thread(p2);
        t2.setName("B");
        t2.start();

        Thread t3 = new Thread(p3);
        t3.setName("C");
        t3.start();




    }

    static class PrintTask implements Runnable {

        public void setReference(AtomicReference<String> reference) {
            this.reference = reference;
        }

        public void setSemaphore(Semaphore semaphore) {
            this.semaphore = semaphore;
        }

        private AtomicReference<String> reference;
        private Semaphore semaphore;

        @Override
        public void run() {



                String name = Thread.currentThread().getName();
                try {
                    Thread.sleep(500);
                    semaphore.acquire(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                while (name.equals(reference.get())) {
                    System.out.println(name);
                    if ("A".equals(name)) {
                        reference.set("B");
                    }
                    if ("B".equals(name)) {
                        reference.set("C");
                    }
                    if ("C".equals(name)) {
                        reference.set("A");
                    }

                    semaphore.release();
                }


            }
        }
    }



