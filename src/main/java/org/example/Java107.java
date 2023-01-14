package org.example;

import java.util.Arrays;

public class Java107 {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int last=a[0];
        for (int i=0;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        a[a.length-1]=last;
        System.out.println(Arrays.toString(a));
    }
}
