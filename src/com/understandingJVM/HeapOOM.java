package com.understandingJVM;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maven on 2018/8/14.
 * Description:
 * vm args:
 * -Xms20m -Xmx20m -xx:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {

    static class OOMObjct {

    }

    public static void main(String[] args) {
        List<OOMObjct> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObjct());
        }
    }
}