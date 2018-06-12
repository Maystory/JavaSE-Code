package com.swun.gaoji;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 *
 * @outhor my
 * @create 2018-06-11 16:11
 */
public class Demo3 {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm:ss");
//        LocalDate now = LocalDate.now();
//        LocalDateTime now = LocalDateTime.now();
//        String nowTime = formatter.format(now);
//        System.out.println(nowTime);
        LocalTime now = LocalTime.now();
        System.out.println(formatter2.format(now));


    }

}