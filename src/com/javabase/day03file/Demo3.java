package com.javabase.day03file;

import java.io.File;

/**
 * Created by Maven on 2018/9/25.
 * Description:
 */
public class Demo3 {
    public static void main(String[] args) {
        // System.out.println(File.pathSeparator);
        // System.out.println(File.pathSeparatorChar);
        // System.out.println(File.separator);
        // System.out.println(File.separatorChar);

        File file = new File("/Users/apple/IdeaProjects/JavaSE-Code/");
        // System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        System.out.println(file.getParentFile());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());
        listFile(file);

    }

    public static void listFile(File file) {
        if (file.exists()) {
            if (file.isDirectory()){
                File[] files = file.listFiles();
                for (File f : files) {
                    listFile(f);
                }
            }
            System.out.println(file.getName());
        }
    }
}