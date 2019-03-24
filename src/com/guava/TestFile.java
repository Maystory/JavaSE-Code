package com.guava;

import java.text.DecimalFormat;
import java.time.Instant;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Maven
 * @since 2018-11-20 10:17
 */
public class TestFile {
    public static void main(String[] args)throws Exception {
        // File resultFile = File.createTempFile("pay-orders-", "-suffix");
        // System.out.println(resultFile);

        // Instant now = Instant.now();
        // System.out.println(now);
        // ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        // int i = threadLocalRandom.nextInt(12);

        Double d = 1.032;
        DecimalFormat format = new DecimalFormat("#");
        System.out.println(format.format(d));
    }
}