package com.swun.Java8.future;

/**
 * <p>
 *
 * </p>
 *
 * @author mf
 * @date 2021-03-03 11:45
 */
public class ProductLoader implements DataLoader{
    @Override
    public String load() {
        delay();
        return "product";
    }

}
