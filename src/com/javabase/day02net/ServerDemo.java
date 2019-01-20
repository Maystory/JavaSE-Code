package com.javabase.day02net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Maven on 2018/9/22.
 * Description:
 */
public class ServerDemo {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务器启动了");
        String data = " 我是服务器给你的响应数据哦。。。";

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println(socket.getInetAddress());
            System.out.println(socket.getPort());
            OutputStream outputStream = socket.getOutputStream();
            PrintStream printStream = new PrintStream(outputStream);

            InputStream inputStream = socket.getInputStream();
            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNextLine()) {
                System.out.println("服务器收到数据："+scanner.nextLine());
            }

            printStream.print(data);
            printStream.close();
            outputStream.close();
            inputStream.close();
            scanner.close();
        }


    }
}