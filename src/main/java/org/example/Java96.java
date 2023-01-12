package org.example;

import java.util.Scanner;

public class Java96 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        int length=str.length();
        System.out.println(str.substring(0,length/2));
    }
}
