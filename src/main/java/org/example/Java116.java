package org.example;

import java.util.Arrays;

public class Java116 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        for(int i=0;i<(a.length)/2;i++){
            int c=a[a.length-1-i];
            a[a.length-1-i] =a[i];
            a[i]=c;
        }
        System.out.println(Arrays.toString(a));
    }
}
