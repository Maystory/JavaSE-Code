package com.javabase.day05commonclass;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.swun.Java8.stream.User;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.nonNull;

/**
 * @author Maven
 * @since 2018-11-11 20:20
 */
public class Demo8 {

    public static void main(String[] args) throws Exception {

        Gson gson = new GsonBuilder()
                .serializeNulls()
                .create();
        List<User> dataList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            User user = new User("username" + i, i);
            dataList.add(user);
        }
        File file = new File("/Users/apple/IdeaProjects/JavaSE-Code/file-data");
        FileWriter fileWriter = null;
        BufferedWriter bw = null;
        try {
            fileWriter = new FileWriter(file);
            bw = new BufferedWriter(fileWriter);
            for (User user : dataList) {
                bw.write(gson.toJson(user));
                System.out.println(gson.toJson(user));
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (nonNull(bw)) {
                bw.close();
            }
            if (nonNull(fileWriter)) {
                fileWriter.close();
            }
        }
    }
}