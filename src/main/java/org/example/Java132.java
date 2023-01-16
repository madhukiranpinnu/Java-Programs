package org.example;

public class Java132 {
    public static <Char> void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                if(j==1 || j==2*i-1) {
                    System.out.print(String.valueOf((char) (i + 64)));
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--){
            System.out.print(" ");
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=2*i-1;k>=1;k--){
                if(k==1 || k==2*i-1){
                    System.out.printf(String.valueOf((char)(i+64)));
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
