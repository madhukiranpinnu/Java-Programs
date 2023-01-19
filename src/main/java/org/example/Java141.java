package org.example;

import java.util.Scanner;

public class Java141 {
    public static void main(String[] args) {
        //linear search
        Scanner sc=new Scanner(System.in);
        int search= sc.nextInt();
        int[] a={1,2,3,4,5,6,8,12,34,56,78,123,1,2,3};
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==search){
               count++;
            }
        }
        if(count!=0){
            System.out.println(count);
        }
    }
}
