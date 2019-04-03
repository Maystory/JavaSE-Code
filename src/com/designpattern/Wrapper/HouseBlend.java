package com.designpattern.Wrapper;

/**
 * @author mf
 * @since 2019-03-14 23:14
 */
public class HouseBlend extends Beverage {


    public HouseBlend() {
        this.description = "houseBlend";
    }

    @Override
    double cost() {
        return 66.66;
    }
}