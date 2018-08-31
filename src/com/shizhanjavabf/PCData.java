package com.shizhanjavabf;

/**
 * Created by Maven on 2018/8/30.
 * Description:
 */
public class PCData {
    private final int intData;

    public PCData(int intData) {
        this.intData = intData;
    }

    public int getIntData() {
        return intData;
    }

    @Override
    public String toString() {
        return "data:"+intData;
    }
}