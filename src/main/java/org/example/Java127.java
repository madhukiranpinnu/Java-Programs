package org.example;

public class Java127 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int k=5;k>=i;k--){
                System.out.printf(" ");
            }
            for (int m=2*i-1;m>=1;m--){
                if((m==2*i-1) || (m==1) || (i==5)){
                    System.out.printf("*");
                }
               else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}
