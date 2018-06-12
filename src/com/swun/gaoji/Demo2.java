package com.swun.gaoji;

import org.joda.time.*;

import java.math.BigDecimal;


/**
 * 描述:
 *
 * @outhor mf
 * @create 2018-06-06 11:06
 */
public class Demo2 {
    public static void main(String[] args) {
//        ArrayList<String> strs = new ArrayList<>();
//        strs.add("324");
//        strs.add("kkf");
//        strs.add("ooo");
//        Iterator<String> iterator = strs.iterator();
//        String next = iterator.next();
//        System.out.println(next);
//        iterator.remove();
//        System.out.println(iterator.next());
////        System.out.println(strs);
//        BigDecimal bigDecimal = new BigDecimal(Double.toString(0.2365));
//        System.out.println(bigDecimal);
//        String[] arr = {"er", "oo", "pp"};
//        //固定长度的List
//        List<String> list = Arrays.asList(arr);
//        list.add("44");
//        System.out.println(list);
//        Date date = new Date();
//        DateTime dateTime = new DateTime(date);
//        System.out.println(dateTime.dayOfMonth().getMaximumValue());
//        System.out.println(dateTime);

        DateTime begin = new DateTime("2012-02-19");
        DateTime end = new DateTime("2012-07-07");
        System.out.println(end.dayOfMonth().getMaximumValue());
        System.out.println(begin.getDayOfMonth());
//
////计算区间毫秒数
//        Duration d = new Duration(begin, end);
//        long time = d.getMillis();
//
////计算区间天数
//        Period p = new Period(begin, end, PeriodType.days());
//        int days = p.getDays();
//
////计算特定日期是否在该区间内
//        Interval i = new Interval(begin, end);
//        boolean contained = i.contains(new DateTime("2012-03-01"));

//        Duration duration = new Duration();
//        System.out.println(duration.getStandardDays());
//
//        Period period = new Period(begin,end);
//        System.out.println(period.getDays());

//        int i = Integer.parseInt("01");
//        System.out.println(i);
//        String str = "2018-01-90";
//        System.out.println(str.substring(str.lastIndexOf("-")+1));
        BigDecimal bigDecimal = new BigDecimal(0);
        BigDecimal add = bigDecimal.add(new BigDecimal("4"));
        System.out.println(add);

    }
}