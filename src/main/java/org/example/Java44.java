package org.example;

import java.util.Scanner;

public class Java44 {
    public static void main(String[] args) {
        //To give random
        Scanner sc=new Scanner(System.in);
        int i= sc.nextInt();
        double rand=Math.random();
        System.out.println(rand*i);
    }
}
