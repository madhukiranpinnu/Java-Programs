package org.example;

public class Java121 {
    public static void main(String[] args) {
        for (int i=0;i<=5;i++){
            for(int k=5;k>=i;k--){
                System.out.printf(" ");
            }
            for (int l=0;l<=i;l++){
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
