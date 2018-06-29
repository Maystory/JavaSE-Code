package com.swun.thinkinjava.chapter14;

import java.util.Arrays;
import java.util.List;

/**
 * 描述:
 *
 * @outhor mf
 * @create 2018-06-14 20:38
 */
public class Square extends Shape {

    @Override
    public String toString() {
        return "Square";
    }


    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(), new Square());
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}