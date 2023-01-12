package org.example;

import java.util.Scanner;

public class Java94 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long i= sc.nextLong();
        long min=i/60;
        long hr=min/60;
        long day=hr/24;
        System.out.println("day = " + day);
        System.out.println("hr = " + hr);
        System.out.println("min = " + min);
    }
}
