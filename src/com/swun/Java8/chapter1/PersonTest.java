package com.swun.Java8.chapter1;

public class PersonTest {
    public static void main(String args[]){
    PersonFactory personFactory = Person::new ;
    Person p1 = personFactory.create("meifan","haoshuai");
    System.out.println(p1.toString());

    }
}
