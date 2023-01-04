package org.example;

import java.util.Scanner;

public class Java37 {
    public static void main(String[] args) {
        //Count number of digits in number
        Scanner sc=new Scanner(System.in);
        int i= sc.nextInt();
        int count=0;
        while(i%10!=0){
           count++;
           i=i/10;
        }
        System.out.println(count);
    }
}
