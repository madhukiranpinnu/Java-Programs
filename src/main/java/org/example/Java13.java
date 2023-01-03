package org.example;

import java.util.Scanner;

public class Java13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int a = r;
        for (int i=1;i<r;i++){
            a=a*r;
        }
        System.out.println(a);
    }
}
