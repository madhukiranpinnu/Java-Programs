package org.example;

public class Java129 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.printf(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--){
            System.out.print(" ");
            for(int j=4;j>=i;j--){
                System.out.printf(" ");
            }
            for (int k=2*i-1;k>=1;k--){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
