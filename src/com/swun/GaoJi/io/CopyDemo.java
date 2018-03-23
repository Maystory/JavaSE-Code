package com.swun.GaoJi.io;

import java.io.*;

/**
 * 描述:
 * 最简单的文件的拷贝操作
 *
 * @outhor mf
 * @create 2018-03-23 20:01
 */
public class CopyDemo {
    public static void main(String[] args) throws Exception {
        File srcFile = new File("java");
        File destFile = new File("txt");
        File[] files = srcFile.listFiles((dir, name) -> new File(dir, name).isFile() && name.endsWith(".java"));
        for (File sFile : files) {
            InputStream in = new FileInputStream(sFile);
            OutputStream out = new FileOutputStream(new File(destFile, sFile.getName()));

            byte[] buffer = new byte[1024];
            int len = 0;
            while ((in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }
            //
            in.close();
            out.close();
        }

    }
}