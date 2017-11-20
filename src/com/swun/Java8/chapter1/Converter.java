package com.swun.Java8.chapter1;
@FunctionalInterface
public interface Converter<F,T> {

    T convert(F f);
}
