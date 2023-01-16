package org.example;

public class Java130 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for (int j=5;j>=i;j--){
                System.out.printf(" ");
            }
            for (int k=2*i-1;k>=1;k--){
                System.out.printf("*");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
