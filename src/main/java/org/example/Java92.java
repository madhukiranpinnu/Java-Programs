package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Java92 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        char [] a=s.toCharArray();
        Set<Character> set=new HashSet<>();
        for (Character a1:a){
            set.add(a1);
        }
        System.out.println(set);
    }
}
