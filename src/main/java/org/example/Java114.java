package org.example;

import java.util.Scanner;

public class Java114 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word= sc.next();
        int n= sc.nextInt();
        char[] ch=word.toCharArray();
        for (int k=1;k<=n;k++) {
            char first = ch[ch.length - 1];
            for (int i = ch.length - 1; i > 0; i--) {
                ch[i] = ch[i - 1];
            }
            ch[0] = first;
        }
        StringBuilder sb=new StringBuilder();
        for(char c:ch){
            sb.append(c);
        }
        System.out.println(sb);
    }
}
