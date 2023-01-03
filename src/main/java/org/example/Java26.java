package org.example;

import java.util.Scanner;

public class Java26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String old= sc.nextLine();
        String rev="";
        int str_length=old.length();
        for(int i=str_length-1;i>=0;i--){
            rev+=old.charAt(i);
        }
        System.out.println(rev);
    }
}
