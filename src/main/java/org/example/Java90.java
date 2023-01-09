package org.example;

import java.util.Scanner;

public class Java90 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int divdend=a/b;
        int rem=0;
        if(a<b){
           rem=b-(divdend*a);
        }
        else{
            rem=a-(divdend*b);
        }
        System.out.println(rem);
    }
}
