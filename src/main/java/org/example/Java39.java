package org.example;

import java.util.Scanner;

public class Java39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i= sc.nextInt();
        int odd_count=0;
        int even_count=0;
        while (i%10!=0){
            if((i%10)%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
            i=i/10;
        }
        System.out.println(odd_count);
        System.out.println(even_count);
    }
}
