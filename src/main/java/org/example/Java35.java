package org.example;

public class Java35 {
    public static void main(String[] args) {
//        To find duplicate elements in array
        int[] a={1,2,3,4,5,6,7,1,4,6,2,3,4};
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]+"duplicate");
                }
            }
        }
    }
}
