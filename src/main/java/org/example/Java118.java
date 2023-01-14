package org.example;

import java.util.Scanner;

public class Java118 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        char[] a=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=a.length-1;i>=a.length-4;i--){
            sb.append(a[i]);
        }
        System.out.println(sb);
    }
}
