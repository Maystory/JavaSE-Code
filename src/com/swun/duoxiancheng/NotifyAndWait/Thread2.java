package com.swun.duoxiancheng.NotifyAndWait;

/**
 * 描述:
 *
 * @outhor my
 * @create 2017-12-05 17:13
 */
public class Thread2 extends Thread {
    private DBTools dbTools;

    public Thread2(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }

}