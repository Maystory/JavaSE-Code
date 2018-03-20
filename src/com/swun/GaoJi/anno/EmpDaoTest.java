package com.swun.GaoJi.anno;

public class EmpDaoTest {
    @MyBefore
    public void init(){
        System.out.println("init---------");
    }
    @MyTest
    public void doWork(){
        System.out.println("doSomething");

    }
}
