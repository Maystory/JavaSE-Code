package com.swun.thinkinjava.chapter14;

/**
 * 描述:
 *
 * @outhor mf
 * @create 2018-06-14 20:33
 */
abstract class Shape {
    void draw() {
        System.out.println(this + "--------------draw");
    }


    @Override
    abstract public String toString();
}