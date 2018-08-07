package com.swun.se;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Maven on 2018/8/6.
 * Description:
 */
public class CalenderDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DATE,-1);
        System.out.println(calendar.getTime());
    }
}