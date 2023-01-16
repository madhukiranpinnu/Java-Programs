package org.example;

public class Java128 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int k=1;k<=5-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j == 1 || j == 2 * i - 1 ) {
                    System.out.printf("*");
                }
                else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--) {
            int k;
            for (k = 5; k >= i; k--) {
                System.out.printf(" ");
            }
            for (int l = 2 * k - 1;l>=1;l--){
                if(l==1 || l==2*k-1){
                    System.out.printf("*");
                }
                else{
                    System.out.printf(" ");
                }
            }
                System.out.println();
        }
    }
}
