package org.example;

import java.util.Scanner;

public class Java111 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String letter= sc.nextLine();
        char[] ch=letter.toCharArray();
        char last=ch[0];
        for(int i=0;i<ch.length-1;i++){
            ch[i]=ch[i+1];
        }
        ch[ch.length-1]=last;
        StringBuilder sb=new StringBuilder();
        for(char ch1:ch){
            sb.append(ch1);
        }
        System.out.println(sb);
    }
}
