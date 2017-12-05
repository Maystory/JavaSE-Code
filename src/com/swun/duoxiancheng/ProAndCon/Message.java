package com.swun.duoxiancheng.ProAndCon;

public class Message {
    private String title;
    private String content;
    private Boolean flag = true;

    synchronized public void set(String title, String content) {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.title = title;
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = content;
        flag = false;
        this.notifyAll();

    }

    synchronized public void get() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("可以消费了:" + this.title + "--------->" + this.content);
            this.flag = true;
            notifyAll();
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
