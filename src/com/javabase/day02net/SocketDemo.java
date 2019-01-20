package com.javabase.day02net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Maven on 2018/9/22.
 * Description:
 */
public class SocketDemo {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 8888);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("服务器你好啊，我是客户端过来的请求............hahahha".getBytes());
        InputStream inputStream = socket.getInputStream();
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        inputStream.close();
        scanner.close();
        outputStream.close();

    }
}