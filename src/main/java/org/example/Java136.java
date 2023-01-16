package org.example;

public class Java136 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
        for (int i=1;i<=5;i++){
            for (int j=0;j<i;j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
