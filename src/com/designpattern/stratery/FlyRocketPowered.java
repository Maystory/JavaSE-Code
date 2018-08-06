package com.designpattern.stratery;

/**
 * Created by Maven on 2018/8/6.
 * Description:
 */
public class FlyRocketPowered implements FlyBehavior {


    @Override
    public void fly() {
        System.out.println(" i m flying with a rocket!!!!");
    }
}