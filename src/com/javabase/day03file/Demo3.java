package com.javabase.day03file;

import java.io.*;

/**
 * @author Maven
 * @date 2018/9/25
 * Description:
 */
public class Demo3 {
    public static void main(String[] args) throws Exception {
        // System.out.println(File.pathSeparator);
        // System.out.println(File.pathSeparatorChar);
        // System.out.println(File.separator);
        // System.out.println(File.separatorChar);

        // File file = new File("/Users/apple/Downloads/1919");
        // System.out.println(file.getAbsoluteFile());
        // System.out.println(file.getAbsolutePath());
        // System.out.println(file.getParent());
        // System.out.println(file.getParentFile());
        // System.out.println(file.isDirectory());
        // System.out.println(file.exists());
        // listFile(file);
        // System.out.println(file.getAbsolutePath());
        // File[] files = file.listFiles((dir, name) -> new File(dir, name).isFile() && name.endsWith(".pptx"));
        // System.out.println(Arrays.toString(files));
        // File file = new File("file.txt");
        // File copy = new File("file.txt-copy");
        // // System.out.println(file.getAbsolutePath());
        // // OutputStream outputStream = new FileOutputStream(file,true);
        // // outputStream.write("向文件中写数据\t".getBytes());
        //
        // System.out.println(file.exists());
        //
        // //文件拷贝
        // copyFile(file, copy);


    }

    public static void copyFile(File src, File target) throws Exception {
        if (!src.exists()) {
            throw new IOException("文件不存在");
        }
        InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(target);
        try {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            in.close();
            out.close();
        }

    }


}