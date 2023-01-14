package org.example;

import java.util.Scanner;

public class Java112 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int n= sc.nextInt();
        char[] ch=s.toCharArray();
        for(int k=1;k<=n;k++) {
            char last = ch[0];
            for (int i = 0; i < ch.length - 1; i++) {
                ch[i] = ch[i + 1];
            }
            ch[ch.length - 1] = last;
        }
        StringBuilder sb=new StringBuilder();
        for (char ch1:ch){
            sb.append(ch1);
        }
        System.out.println(sb);
    }
}
