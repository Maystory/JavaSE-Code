package com.swun.GaoJi;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 描述:
 *
 * @outhor my
 * @create 2018-05-31 11:25
 */
public class TestDemo {

    public static void main(String[] args)throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date date = simpleDateFormat.parse("2017-08-01");
        System.out.println(date);
    }

}