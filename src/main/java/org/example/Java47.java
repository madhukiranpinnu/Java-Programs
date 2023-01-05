package org.example;

public class Java47 {
    public static void main(String[] args) {
        //missing element in array only one
        int[] a={1,2,3,4,5,6,7,8,10};
        int sum=0;
        int a_sum=0;
        for(int i=1;i<=10;i++){
           sum+=i;
        }
        for(int i:a){
            a_sum+=i;
        }
        System.out.println(sum-a_sum);
    }
}
