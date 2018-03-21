package com.swun.GaoJi.net.cs1;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
//接收端
public class Receive {

    public static void main(String args[]) throws Exception{
        DatagramSocket recevier = new DatagramSocket(10086);
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, 1024);
        while (true) {
            recevier.receive(datagramPacket);
            String string = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
            System.out.println("发送过来的数据:" + string);
        }
    }

}
