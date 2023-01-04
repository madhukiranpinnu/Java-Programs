package org.example;

import java.util.Scanner;

public class Java43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i= sc.nextInt();
        int rev=0;
        while (i%10!=0){
            int k=i%10;
            rev=rev*10+k;
            i=i/10;
        }
        System.out.println(rev);
    }
}
