package com.swun.GaoJi.net.cs2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send {
    //发送端
    public static void main(String args[]) throws Exception{
        String data = " i send the msg";
        DatagramSocket sender = new DatagramSocket(10010);
        DatagramPacket datagramPacket = new DatagramPacket(data.getBytes(),
                data.getBytes().length, InetAddress.getLocalHost(), 10086);
        sender.send(datagramPacket);
        sender.close();
    }
}
