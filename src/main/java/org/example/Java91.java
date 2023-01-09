package org.example;

import java.util.Scanner;

public class Java91 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int great = 0;
        for (int i=1;i<a&&i<b;i++){
            if((a%i==0)&&(b%i==0)){
                great=i;
            }
        }
        System.out.println(great);
    }
}
