package org.example;

public class Java48 {
    public static void main(String[] args) {
        //min and max in array
        int[] a={1,2,3,45,5,6,7,9,0};
        int max=a[0];
        int min=a[0];
        for (int i=0;i< a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
