package org.example;

public class Java41 {
    public static void main(String[] args) {
        //sum in array
        int sum = 0;
        int[] a={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
