package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Java115 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int[] a=new int[size];
        for(int i=0;i<size;i++){
            a[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }
}
