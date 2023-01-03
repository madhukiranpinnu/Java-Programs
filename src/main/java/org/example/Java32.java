package org.example;

import java.util.Scanner;

public class Java32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i= sc.nextInt();
        int k=1;
        for(int j=i;j>0;j--){
            k*=j;
        }
        System.out.println(k);
    }
}
