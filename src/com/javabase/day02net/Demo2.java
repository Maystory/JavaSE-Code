package com.javabase.day02net;

import java.net.InetAddress;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * Created by Maven on 2018/9/22.
 * Description:
 */
public class Demo2 {
    public static void main(String[] args)throws Exception {
        // try {
        //     InetAddress inetAddress = InetAddress.getLocalHost();
        //     System.out.println(inetAddress.getHostName());
        //     boolean reachable = inetAddress.isReachable(1000);
        //     System.out.println(reachable);
        // } catch (UnknownHostException e) {
        //     e.printStackTrace();
        // }

        // System.out.println(System.getProperty("file.encoding"));
        String name = "梅凡";
        // String encode = URLEncoder.encode(name, "UTF-8");
        // System.out.println(encode);
        // System.out.println(URLDecoder.decode(encode,"UTF-8"));

        byte[] bytes = name.getBytes("UTF-8");
        System.out.println(Arrays.toString(bytes));
        String s = new String(bytes, "UTF-8");
        System.out.println(s);
    }
}