package org.example;

import java.util.Scanner;

public class Java9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        boolean b=false;
        switch (a){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':b=true;
            break;
        }
        if(b==true){
            System.out.println("vowel");
        }
        else {
            System.out.println(false);
        }
    }
}
