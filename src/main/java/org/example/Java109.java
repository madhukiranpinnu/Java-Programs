package org.example;

import java.util.Arrays;

public class Java109 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        int first=a[a.length-1];
        for(int i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=first;
        System.out.println(Arrays.toString(a));
    }
}
