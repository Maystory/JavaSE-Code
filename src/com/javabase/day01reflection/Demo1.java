package com.javabase.day01reflection;


import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by Maven on 2018/9/21.
 * Description:
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        // Object obj = new Date();
        // Method method = obj.getClass().getMethod("toLocaleString");
        // Object result = method.invoke(obj);
        // System.out.println(result);

        // //第一种方式
        // Date date = new Date();
        //
        // Class<? extends Date> dateClass1= date.getClass();
        // System.out.println(dateClass1);
        // //第二种
        // Class<Date> dateClass2 = Date.class;
        // System.out.println(dateClass2);
        // //第三种
        // Class<?> dateClass3 = Class.forName("java.util.Date");
        // System.out.println(dateClass3==dateClass2);
        //
        //
        // System.out.println(Integer.TYPE == int.class);
        //
        // System.out.println("------获取构造器：-------");
        // //获取所有public构造
        // Constructor<?>[] publicConstructors = date.getClass().getConstructors();
        // System.out.println(publicConstructors.length);
        //
        // //获取所有构造
        // Constructor<?>[] declaredConstructors = date.getClass().getDeclaredConstructors();
        // System.out.println(declaredConstructors.length);
        //
        // //获取指定类型的publc构造
        // Constructor<? extends Date> constructorT = date.getClass().getConstructor(long.class);
        // System.out.println(constructorT);
        //
        // System.out.println("------利用反射创建对象：-------");

        Class<?> clz = Class.forName("com.javabase.day01reflection.User");
        // Object user1 = clz.newInstance();
        // System.out.println(user1);

        // Constructor<?> constructor = clz.getConstructor(String.class);
        // Object user = constructor.newInstance("龙哥");
        // System.out.println(user instanceof User);
        // System.out.println(user);

        //可以获取私有的
        // Constructor<?> cons = clz.getDeclaredConstructor(String.class, String.class);
        // //设置私有的可以访问。。
        // cons.setAccessible(true);
        // Object longge = cons.newInstance("Longge", "17");
        // System.out.println(longge);

        // System.out.println("------利用反射获取类中的方法：-------");
        // //Declared方法只是类本身的方法（包括私有的），但是没有继承来的
        // Method[] declaredMethods = clz.getDeclaredMethods();
        // for (Method declaredMethod : declaredMethods) {
        //     System.out.println(declaredMethod.getName());
        // }
        // System.out.println("----------");
        // //getMethods 获取所有的方法 不包括私有的，但是包括继承来的
        // Method[] methods = clz.getMethods();
        // for (Method method : methods) {
        //     System.out.println(method.getName());
        // }

        // Method method = clz.getMethod("getClass");
        // System.out.println(method.getName());
        // Method declaredMethod = clz.getDeclaredMethod("privteMethod");
        // System.out.println(declaredMethod.getName());
        // Method sayMethod
        //         = clz.getDeclaredMethod("say", String.class);
        // Object result = sayMethod.invoke(clz.newInstance(), "我是参数..");
        // System.out.println(result);
        //
        // Method privteMethod = clz.getDeclaredMethod("privteMethod");
        // privteMethod.setAccessible(true);
        // privteMethod.invoke(clz.newInstance());
        // Method voidStatic = clz.getMethod("voidStatic");
        // voidStatic.invoke(null);
        //
        // Method staticMethod1 = clz.getMethod("staticMethod1", String[].class);
        // //调用数组很复杂的 new Object[]{ ....}
        // Object result = staticMethod1.invoke(null, new Object[]{new String[]{"aaa", "bbb", "ccc"},});
        // System.out.println(result);

        // System.out.println(clz.getName());
        // System.out.println(clz.getSimpleName());
        // System.out.println(clz.getPackage());
        // System.out.println(clz.getModifiers());

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("db.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        System.out.println(properties.setProperty("root","shuaige"));


    }
}