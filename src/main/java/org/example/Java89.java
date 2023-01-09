package org.example;

import java.util.Scanner;

public class Java89 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i= sc.nextInt();
        for(int j=0;j<=i/2;j++){
            if(j*j==i){
                System.out.println(j);
            }
        }
    }
}
