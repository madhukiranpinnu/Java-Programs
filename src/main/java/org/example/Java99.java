package org.example;

import java.util.Scanner;

public class Java99 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line= sc.nextLine();
        String[] words=line.split(" ");
        System.out.println(words[words.length-2]);
    }
}
