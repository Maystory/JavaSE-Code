package com.swun.Java8.optional;

import com.swun.Java8.stream.User;
import org.junit.Test;

import java.nio.file.OpenOption;
import java.util.Optional;

/**
 * Java 8 Optional
 */
public class OptionalTest {

    // @Test
    // public void test(){
    //     Optional<String> optional = Optional.of("bam");
    //     boolean present = optional.isPresent();
    //     printOption(optional, present);
    //
    // }
    //
    // private void printOption(Optional<String> optional, boolean present) {
    //     System.out.println(present);
    //     String s = optional.get();
    //     System.out.println(s);
    //     optional.ifPresent(System.out::println);
    //     optional.orElse("54");
    // }

    public static void main(String[] args) {
        User user = new User("name", 11);
        User u2 = null;
        Optional<User> o1 = Optional.ofNullable(user);

        o1.ifPresent((x)-> System.out.println(x.toString()));
        Optional<Integer> integer = o1.map(y -> y.getAge());

        final String name = "meifan";
        o1.ifPresent(o-> System.out.println(name));

    }
}
