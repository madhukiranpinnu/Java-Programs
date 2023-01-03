package org.example;

import java.util.Scanner;

public class Java15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len= sc.nextInt();
        int[] a=new int[len];
        int b=0;
        for(int i=0;i<len;i++){
            a[i]= sc.nextInt();
            b+=a[i];
        }
        System.out.println(b/len);
    }
}
