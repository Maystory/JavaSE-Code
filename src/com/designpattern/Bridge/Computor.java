package com.designpattern.Bridge;

/**
 * <p>
 *电脑
 * </p>
 *
 * @author mf
 * @date 2020-04-29 20:54
 */
public class Computor implements Product {

    private Brand brand;

    public Computor(Brand brand) {
        this.brand = brand;
    }

    @Override
    public void printProduct() {
        brand.printBand();
        System.out.println("computor");

    }
}
