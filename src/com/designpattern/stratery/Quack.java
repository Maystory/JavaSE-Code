package com.designpattern.stratery;

/**
 * Created by Maven on 2018/8/6.
 * Description:
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println(" quack method of Quack");
    }
}