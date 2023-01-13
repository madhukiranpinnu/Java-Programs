package org.example;

public class Java104 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for (int j=1;j<=5-i;j++){
                System.out.printf(" ");
            }
            for (int k=1;k<=i;k++){
                if (k%2==0){
                    System.out.printf("0 ");
                }
                else {
                    System.out.printf("1 ");
                }
            }
            System.out.println();
        }
    }
}
