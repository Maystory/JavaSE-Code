package com.swun.duoxiancheng.NotifyAndWait;

/**
 * 描述:
 * 1
 *
 * @outhor my
 * @create 2017-12-05 17:11
 */
public class Thread1 extends Thread {
    private DBTools dbTools;

    public Thread1(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}