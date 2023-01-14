package org.example;

import java.util.Scanner;

public class Java113 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word= sc.next();
        char[] ch=word.toCharArray();
        char first=ch[ch.length-1];
        for(int i= ch.length-1;i>0;i--){
            ch[i]=ch[i-1];
        }
        ch[0]=first;
        StringBuilder sb=new StringBuilder();
        for(char c:ch){
            sb.append(c);
        }
        System.out.println(sb);
    }
}
