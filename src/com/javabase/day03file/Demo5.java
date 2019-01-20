package com.javabase.day03file;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Maven on 2018/9/26.
 * Description:
 */
public class Demo5 {
    public static void main(String[] args) throws Exception {
        //jdk1.7  FileVisitor 文件访问
        Path path = Paths.get("/Users/apple/Downloads/1919");
        List<String> result = new LinkedList<>();
        Files.walkFileTree(path, new MyFileHandler(result));
        result.forEach(System.out::println);


        //jdk1.7 Files 超级简单的文件拷贝
        Files.copy(Paths.get("/Users/apple/Downloads/1919/Sharding-JDBC入门.pptx")
                ,Paths.get("/Users/apple/IdeaProjects/JavaSE-Code/src/files-copy.pptx"));
        System.out.println("copy ..");
    }
}

class MyFileHandler implements FileVisitor<Path> {

    private List<String> result;

    public MyFileHandler(List<String> result) {
        this.result = result;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("preVisitDirectory.........");
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.toString().endsWith(".pptx")) {
            result.add(file.toString());
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("visitFileFailed.......");
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("postVisitDirectory.....");
        return FileVisitResult.CONTINUE;
    }
}