package org.example;

import java.util.Scanner;

public class Java53 {
    public static void main(String[] args) {
        //spaces
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String n=s.replaceAll(" ","");
        System.out.println(n);
    }
}
