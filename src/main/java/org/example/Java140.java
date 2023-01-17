package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Java140 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine().toLowerCase().replaceAll("//s","");
        String s2=sc.nextLine().toLowerCase().replaceAll("//s","");
        char[] s1_CH=s1.toCharArray();
        char[] s2_CH=s2.toCharArray();
        Arrays.sort(s1_CH);
        Arrays.sort(s2_CH);
        if(Arrays.equals(s1_CH, s2_CH)){
            System.out.println("Anagram");
        }
        else {
            System.out.println("not anagram");
        }
    }
}
