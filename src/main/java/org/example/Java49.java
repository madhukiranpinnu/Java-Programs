package org.example;

public class Java49 {
    public static void main(String[] args) {
        //searching
        int[] a={1,2,3,4,5,5,6,7,10};
        int search=7;
        for(int i=0;i<a.length;i++){
            if(a[i]==search){
                System.out.println("found at"+i);
            }
        }
    }
}
