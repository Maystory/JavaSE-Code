package com.swun.GaoJi.io;

import java.io.File;

/**
 * 描述:
 *
 * @outhor my
 * @create 2018-03-23 11:22
 */
public class IOdemo1 {
    public static void main(String[] args) {
        File path = new File("D:/NOTES");
        printFile(path);
    }

    private static void printFile(File path) {
        if (path.exists()){
            System.out.println(path);
            File[] files = path.listFiles();
            for (File file:files){
                System.out.println(file);
                if (file.isDirectory()){
                    printFile(file);
                }
            }
        }
    }
}