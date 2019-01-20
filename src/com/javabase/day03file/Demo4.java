package com.javabase.day03file;

import org.junit.Test;

import java.io.FileReader;
import java.io.Reader;

/**
 * Created by Maven on 2018/9/26.
 * Description:
 */
public class Demo4 {
    /**
     * 字符输入
     * @throws Exception
     */
    @Test
    public void test1() throws Exception {
        Reader reader = new FileReader("/Users/apple/IdeaProjects/JavaSE-Code/file.txt");
        char[] buffer = new char[4];
        StringBuilder stringBuilder = new StringBuilder();
        int len = 0;
        while (len != -1) {
            len = reader.read(buffer);
            stringBuilder.append(buffer);
        }
        reader.close();
        System.out.println(stringBuilder.toString());

    }

}