package org.example;

public class Java106 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i<=5){
                for(int j=1;j<=5-i;j++){
                    System.out.print(" ");
                }
                for (int k=1;k<=i;k++){
                    System.out.print("* ");
                }
            }
            else if(i>5 &&i<=10){
                    for (int m = 6; m <= i; m++) {
                        System.out.printf(" ");
                    }
                    for (int l = 10; l >= i; l--) {
                        System.out.print("* ");
                    }
            }
                System.out.println();
        }
    }
}
