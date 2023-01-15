package org.example;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Java125 {
    public static void main(String[] args) throws UnknownHostException {
        Scanner sc=new Scanner(System.in);
        String web= sc.nextLine();
        InetAddress inetAddress=InetAddress.getByName(web);
        System.out.println(inetAddress);
        sc.close();
    }
}
