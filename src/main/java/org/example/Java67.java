package org.example;

public class Java67 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for (int j=1;j<=5;j++) {
                if(j<=i){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}
