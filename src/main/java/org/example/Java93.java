package org.example;

import java.util.Scanner;

public class Java93 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String[]a=s.split(" ");
        String StringReverse="";
        for (String word:a){
            String reverseWord="";
            for (int i=word.length()-1;i>=0;i--){
                reverseWord=reverseWord+word.charAt(i);
            }
            StringReverse=StringReverse+" "+reverseWord;
        }
        System.out.println(StringReverse);
    }
}
