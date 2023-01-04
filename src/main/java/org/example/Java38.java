package org.example;

import java.util.Scanner;

public class Java38 {
    public static void main(String[] args) {
        //sum of digits in number
        Scanner sc=new Scanner(System.in);
        int i= sc.nextInt();
        int sum=0;
        while (i%10!=0){
            sum=sum+i%10;
            i=i/10;
        }
        System.out.println(sum);
    }
}
