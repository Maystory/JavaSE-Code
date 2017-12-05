package com.swun.duoxiancheng.NotifyAndWait;

/**
 * 描述:
 * dbtools
 *
 * @outhor my
 * @create 2017-12-05 17:05
 */
public class DBTools {
    volatile private boolean prevIsA = false;

    synchronized public void backupA() {
        try {
            while (prevIsA == true) {
                wait();
            }

            System.out.println("*******A********");

            prevIsA = true;
            notifyAll();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void backupB() {
        try {
            while (prevIsA == false) {
                wait();
            }

            System.out.println("---------B----------");

            prevIsA = false;
            notifyAll();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}