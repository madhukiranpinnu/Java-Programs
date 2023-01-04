package org.example;

public class Java42 {
    public static void main(String[] args) {
        int[] i={1,2,3,4,5,6};
        int odd_count=0;
        int even_count=0;
        for(int i1:i){
            if (i1%2==0){
                System.out.println("even"+i1);
            }
            else {
                System.out.println("odd"+i1);
            }
        }
    }
}
