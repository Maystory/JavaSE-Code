package com.swun.Java8.chapter1;

public interface PersonFactory<P extends Person> {
    P create(String firstname,String lastname);

}
