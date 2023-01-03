package org.example;

import java.util.Scanner;

public class Java27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String original= sc.nextLine();
        String rev="";
        int original_length=original.length();
        for(int i=original_length-1;i>=0;i--){
            rev+=original.charAt(i);
        }
        int k=0;
        for(int i=0;i<original_length;i++){
            if(rev.charAt(i)==original.charAt(i)){
                k++;
            }
        }
        if(original_length==k){
            System.out.println("polindrome");
        }
        else{
            System.out.println("not");
        }
    }
}
