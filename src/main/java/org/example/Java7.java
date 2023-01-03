package org.example;

import java.util.Scanner;

public class Java7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        if((a%4==0)&&(a%100!=0)){
            System.out.println("leap year"+a);
        }
        else if (a%400==0) {
            System.out.println(a);
        }
    }
}
