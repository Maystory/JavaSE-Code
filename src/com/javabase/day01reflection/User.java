package com.javabase.day01reflection;

import java.util.Arrays;

/**
 * Created by Maven on 2018/9/21.
 * Description:
 */
public class User {
    private String name;
    private String age;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    private void privteMethod() {
        System.out.println("privteMethod........");
    }

    public String say(String string) {
        return "say :" + string;
    }

    public static void voidStatic() {
        System.out.println("voidStatic...");
    }

    public static String staticMethod1(String... str) {
        return Arrays.toString(str);
    }
}