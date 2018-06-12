package com.swun.gaoji.net.cs1;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String args[]) throws Exception{
        String data = "我是服务的数据哦";
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端程序准备完毕");
        boolean accept =true;
        while (accept){
            Socket client = serverSocket.accept();
            System.out.println("连接过来的客户端: "+client.getInetAddress());
            PrintStream printStream = new PrintStream(client.getOutputStream());
            printStream.println(data);
            printStream.close();

        }
        serverSocket.close();
    }
}
