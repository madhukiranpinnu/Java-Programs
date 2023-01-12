package org.example;

import java.util.Scanner;

public class Java97 {
    public static void main(String[] args) {
        int[] a={1,2,3,5,5,1,3,5,7,1,3,5};
        Scanner sc=new Scanner(System.in);
        int s= sc.nextInt();
        int count=0;
        for(int i=0;i< a.length-1;i++){
           if(s==a[i]){
               System.out.println(a[i]+" "+i+"position");
               break;
           }
        }
    }
}
