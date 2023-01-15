package org.example;

import java.util.Arrays;

public class Java119 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={1,2,3,4,5};
        for(int i=0;i<=a.length-1;i++){
            a[i]=a[i]+b[i];
        }
        System.out.println(Arrays.toString(a));
    }
}
