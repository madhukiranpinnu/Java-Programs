package org.example;

import java.util.Scanner;

public class Java20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=0;
        while (a%10!=0){
           b=b+a%10;
           a=a/10;
        }
        System.out.println(b);
    }
}
