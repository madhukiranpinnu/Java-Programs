package org.example;

import java.util.Scanner;

public class Java6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        for (int i=1;i<100;i++){
            System.out.println(a+"*"+i+"="+a*i);
        }
    }
}
