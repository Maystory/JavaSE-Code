package com.swun.Java8.practice;

/**
 * 描述:
 * 交易员
 *
 * @outhor my
 * @create 2018-04-19 14:57
 */
public class Trader {

    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "city='" + city + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}