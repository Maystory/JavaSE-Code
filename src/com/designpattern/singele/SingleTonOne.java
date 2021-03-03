package com.designpattern.singele;

/**
 * <p>
 *  Hoder 模式
 * </p>
 *
 * @author mf
 * @date 2021-01-22 10:54
 */
public class SingleTonOne {

    private SingleTonOne() {
    }

    public SingleTonOne getOne() {
        return HolderClass.ONE;
    }

    /**
     * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     * 没有绑定关系，而且只有被调用到才会装载，从而实现了延迟加载
     */
    static class HolderClass {
        private static final SingleTonOne ONE = new SingleTonOne();

    }
}
