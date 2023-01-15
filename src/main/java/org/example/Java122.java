package org.example;

public class Java122 {
    public static void main(String[] args) {
        for (int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){
                System.out.printf(" ");
            }
            for (int k=5;k>=i;k--){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
