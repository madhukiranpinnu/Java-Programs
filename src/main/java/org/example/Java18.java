package org.example;

import java.util.Scanner;

public class Java18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=0;
        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
    }
}
