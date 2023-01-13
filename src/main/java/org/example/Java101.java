package org.example;

import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String original= sc.nextLine();
        String[] Original_Array=original.split(" ");
        StringBuilder FirstCap= new StringBuilder();
        for(String word:Original_Array){
            StringBuilder word_cap= new StringBuilder();
            char[] char_l=word.toCharArray();
           for(int i=0;i<char_l.length-1;i++){
               if(i==0){
                  char_l[i]= (char) (char_l[i]-32);
               }
               word_cap.append(char_l);
           }
           FirstCap.append(word_cap);
        }
        System.out.println(FirstCap);
    }
}
