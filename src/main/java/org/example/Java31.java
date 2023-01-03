package org.example;

import java.util.Scanner;

public class Java31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i= sc.nextInt();
        int i1=i;
        int j=0;
        while (i%10!=0){
            int k=i%10;
           j+=+k*k*k;
           i=i/10;
        }
        if(i1==j){
            System.out.println("Arm");
        }
        else {
            System.out.println("not");
        }
    }
}
