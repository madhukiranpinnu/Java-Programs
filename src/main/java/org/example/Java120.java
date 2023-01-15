package org.example;

public class Java120 {
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
         for (int k=1;k<5-i;k++){
             System.out.printf(" ");
         }
         for(int k=0;k<i;k++){
             System.out.printf("*");
         }
            System.out.println("");
        }
    }
}
