package org.example;

import java.util.Scanner;

public class Java54 {
    public static void main(String[] args) {
    //number of occurances of a letter
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c='a';
        char[] find=s.toCharArray();
        int count=0;
        for(char a:find){
            if(c==a){
                count++;
            }
        }
        System.out.println(count);
    }
}
