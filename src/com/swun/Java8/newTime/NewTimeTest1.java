package com.swun.Java8.newTime;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * 描述:
 * Java8新的时间类型
 *
 * @outhor my
 * @create 2017-12-29 14:50
 */
public class NewTimeTest1 {
    /**
     * 本地化日期时间 API
     * LocalDateTime  LocalDate  LocalTime
     */
    @Test
    public void test1() {
        //日期+时间 不好看
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("currentTime:" + currentTime);
        //仅 当前的日期
        LocalDate localDate = currentTime.toLocalDate();
        System.out.println("localDate is " + localDate);

        Month month = currentTime.getMonth();
        int dayOfMonth = currentTime.getDayOfMonth();
        int second = currentTime.getSecond();
        //
        System.out.println("  month:  " + month.toString() + "   dayofMonth:" + dayOfMonth + "      second" + second);
    }

    @Test
    public void test2() {
        //2011-12-01T15:10:49.874
        LocalDateTime localDateTime = LocalDateTime.now().withDayOfMonth(1).withYear(2011);
        System.out.println(localDateTime);
    }

    @Test
    public void test3() {
        LocalDate date2 = LocalDate.of(2014, Month.DECEMBER, 12);
        //2014-12-12
        System.out.println(date2);
    }

    @Test
    public void test4() {
        LocalTime parse = LocalTime.parse("20:15:30");
        //20:15:30
        System.out.println(parse);
    }
}