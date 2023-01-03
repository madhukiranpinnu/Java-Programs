package org.example;

import java.util.Scanner;

public class Java24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        char[] c=s.toCharArray();
        int ch_count=0;
        int num_count=0;
        int space_count=0;
        for (char c1:c) {
            if((c1>=97)&&(c1<=122)||(c1>=65)&&(c1<=90)){
                ch_count+=1;
            }
            else if(c1==' '){
              space_count+=1;
            }
            else if(Character.isDigit(c1)){
                num_count+=1;
            }
            else {
                System.out.println("`");
            }
        }
        System.out.println(num_count);
        System.out.println(space_count);
        System.out.println(ch_count);
    }
}
