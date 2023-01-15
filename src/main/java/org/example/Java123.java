package org.example;

public class Java123 {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            if(i<=5) {
                System.out.printf(" ");
                for (int k = 5; k > i; k--) {
                    System.out.printf(" ");
                }
                for (int l = 1; l < i; l++) {
                    System.out.printf("*");
                }
            }
            else if ((i>5) && (i<=10)) {
              for(int m=6;m<=i;m++){
                  if(m==6){

                  }
                  else{
                      System.out.print(" ");
                  }
              }
              for (int n=10;n>=i;n--){
                  System.out.print("*");
              }
            }
            System.out.println("");
        }
    }
}
