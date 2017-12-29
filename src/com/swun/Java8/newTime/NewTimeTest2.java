package com.swun.Java8.newTime;

import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 描述:
 * 使用时区的日期时间API
 *
 * @outhor my
 * @create 2017-12-29 15:17
 */
public class NewTimeTest2 {
    @Test
    public void test1() {
        /**
         * 2015-12-03T10:15:30+08:00[Asia/Shanghai]
         Europe/Paris
         Asia/Shanghai
         */
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2015-12-03T10:15:30+05:30[Asia/Shanghai]");
        System.out.println(zonedDateTime);

        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println(zoneId);

        ZoneId systemDefault = ZoneId.systemDefault();
        System.out.println(systemDefault);
    }

}