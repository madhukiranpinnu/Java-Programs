package org.example;

public class Java131 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
           for (int j=1;j<5-i;j++){
               System.out.print(" ");
           }
           int n=1;
           for (int k=0;k<=i;k++){
                   System.out.printf(String.valueOf(n+" "));
                   n=n*(i-k)/(k+1);
           }
            System.out.println();
        }
    }
}
