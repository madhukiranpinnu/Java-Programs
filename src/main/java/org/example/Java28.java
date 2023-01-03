package org.example;

import java.util.Scanner;

public class Java28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int original= sc.nextInt();
        int original_copy=original;
        int duplicate=0;
        while(original%10!=0){
            duplicate=duplicate*10+original%10;
            original/=10;
        }
        System.out.println(duplicate);
        if(original_copy==duplicate){
            System.out.println("polindrome");
        }
        else {
            System.out.println("not");
        }
    }
}
