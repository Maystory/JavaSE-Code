package com.swun.GaoJi.introsp;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class InspeDemoTest {
    public static void main(String args[]) throws Exception {
        //获取某一份字节码的JavaBean对象
        BeanInfo beanInfo = Introspector.getBeanInfo(User.class, Object.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor p : propertyDescriptors) {
            System.out.println(p.getName() +","+p.getPropertyType());

            System.out.println("---------");
            //gettter方法
            Method readMethod = p.getReadMethod();
            //setter方法
            Method writeMethod = p.getWriteMethod();
            System.out.println(readMethod);
            System.out.println(writeMethod);

        }
    }
}
