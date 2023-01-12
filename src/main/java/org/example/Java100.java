package org.example;

public class Java100 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int c=0;
        c=a[a.length-1];
        a[a.length-1]=a[0];
        a[0]=c;
        for (int u:a){
            System.out.println(u);
        }
    }
}
