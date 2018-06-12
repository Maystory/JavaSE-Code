package com.swun.gaoji.serilize;

import com.swun.Java8.stream.User;

import java.io.*;

public class ObjectStremDemo {
    public static void main(String args[]) throws Exception {
        File file = new File("obj.txt");

        //对象的序列化
        //writeObj(file);
        //对象的反序列化
        readObj(file);
    }

    private static void readObj(File file)throws Exception {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        User o = (User) objectInputStream.readObject();
        System.out.println(o);
    }

    private static void writeObj(File file) throws Exception {
        User user = new User();
        user.setAge(11);
        user.setUsername("mf");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(user);
    }


}
