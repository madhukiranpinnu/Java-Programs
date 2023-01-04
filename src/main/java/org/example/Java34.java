package org.example;

public class Java34 {
    public static void main(String[] args) {
//        Remove Duplicates from sorted array
        int[] a={1,1,2,3,4,4,5,5,5,7,9,9,10};
        int a_length=a.length;
        int j=0;
        for(int i=0;i<a_length-1;i++){
            if(a[i]!=a[i+1]){
                a[j]=a[i];
                j++;
            }
        }
        a[j]=a[a_length-1];
        for (int k=0;k<=j;k++){
            System.out.println(a[k]);
        }
    }
}
