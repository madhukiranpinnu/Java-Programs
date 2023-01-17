package org.example;

import java.util.Scanner;

public class Java138 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int number= sc.nextInt();
        while(number%4==0){
            count++;
            number=number/4;
        }
        if(count!=0){
            System.out.println("Power of 4"+" "+count);
        }
    }
}
