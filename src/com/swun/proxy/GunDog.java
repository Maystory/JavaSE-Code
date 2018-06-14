package com.swun.proxy;

/**
 * 描述:
 *
 * @outhor my
 * @create 2018-06-14 11:09
 */
public class GunDog implements Dog {
    @Override
    public void info() {
        System.out.println("the Gundog info-------");
    }

    @Override
    public void run() {
        System.out.println("the GunDog run--------");
    }
}