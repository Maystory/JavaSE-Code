package com.swun.gaoji.net.cs2;

import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String args[]) throws Exception{
        Socket client = new Socket("localhost", 8888);
        Scanner scanner = new Scanner(client.getInputStream());
        while (scanner.hasNext()){
            String nextLine = scanner.nextLine();
            System.out.println(nextLine);
        }
        scanner.close();
    }
}
