package com.swun.Java8.optional;

import org.junit.Test;

import java.util.Optional;

/**
 * Java 8 Optional
 */
public class OptionalTest {

    @Test
    public void test(){
        Optional<String> optional = Optional.of("bam");
        boolean present = optional.isPresent();
        System.out.println(present);
        String s = optional.get();
        System.out.println(s);
        optional.ifPresent(System.out::println);
        optional.orElse("54");

    }
}
