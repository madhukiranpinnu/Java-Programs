package org.example;

import java.util.Scanner;

public class Java25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int z= sc.nextInt();
        int i=0;
        int j=1;
        int k;
        while(i<z){
            System.out.println(i);
            k=i;
            i+=j;
            j=k;
        }
    }
}
