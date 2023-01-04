package org.example;

import java.util.HashSet;
import java.util.Set;

public class Java36 {
    public static void main(String[] args) {
//        find Duplicates from Array
        int[] a={1,2,3,4,5,12,1,2,3,4};
        Set<Integer> set=new HashSet<>();
        for(int i:a){
            if(!(set.add(i))){
                System.out.println(i+"duplicated");
            }
        }
    }
}
