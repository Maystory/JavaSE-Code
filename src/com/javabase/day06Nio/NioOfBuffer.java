package com.javabase.day06Nio;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;


/**
 * <p>
 *    bufferDemo
 * </p>
 *
 * @author mf
 * @date 2019-08-08 18:32
 */

public class NioOfBuffer {
    public static void main(String[] args) throws Exception {
        try (RandomAccessFile accessFile = new RandomAccessFile("/Users/apple/IdeaProjects/JavaSE-Code/file-data", "rw")) {
            FileChannel fileChannel = accessFile.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(48);
            int read = fileChannel.read(buffer);
            while (read != -1) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }
                buffer.clear();
                read = fileChannel.read(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
