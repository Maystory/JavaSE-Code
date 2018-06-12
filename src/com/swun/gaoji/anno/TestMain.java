package com.swun.gaoji.anno;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class TestMain {
   public static void main(String args[]) throws Exception{
       //通过反射拿到被注解修饰的类
       Class clazz = EmpDaoTest.class;
       //拿到类的对象
       Object instance = clazz.newInstance();
       //拿到公共的方法 判断是否存在被目标注解所修饰 存入list中
       Method[] methods = clazz.getMethods();
       ArrayList<Method> beforList = new ArrayList<>();
       ArrayList<Method> testList = new ArrayList<>();
       for (Method method:methods){
           if (method.isAnnotationPresent(MyBefore.class)){
               beforList.add(method);
           }else if(method.isAnnotationPresent(MyTest.class)){
               testList.add(method);
           }
       }
       //依次迭代list中每一个method对象 并执行这个方法
       //真正发挥注解逻辑的代码
       for (Method method :testList){
           for (Method bm :beforList){
               //执行MyBefor所标注的方法
               bm.invoke(instance);
           }
           //执行Mytest所标注的方法
           method.invoke(instance);
       }


   }
}
