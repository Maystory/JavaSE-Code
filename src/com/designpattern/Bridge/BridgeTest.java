package com.designpattern.Bridge;

/**
 * <p>
 *  不同维度的组合 其实就是桥接
 * </p>
 *
 * @author mf
 * @date 2020-04-29 20:57
 */
public class BridgeTest {
    public static void main(String[] args) {
        Computor c = new Computor(new LianXiang());
    }
}
