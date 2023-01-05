package org.example;

public class Java46 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3,4};
        int[] b = {1, 2, 3, 4};
        int count = 0;
        if (a.length != b.length) {
            System.out.println("not equal");
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==b[i]){
                count++;
            }
        }
        if(count==a.length){
            System.out.println("correct");
        }
        else{
            System.out.println("not equal");
        }
    }
}
