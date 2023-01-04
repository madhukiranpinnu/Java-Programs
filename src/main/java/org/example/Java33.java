package org.example;

import java.util.HashSet;
import java.util.Set;

public class Java33 {
    public static void main(String[] args) {
//        To remove duplicates from array
        int[] a={1,2,4,1,2,4,5,6,7,5};
        Set<Integer> set=new HashSet<>();
        int a_length=a.length;
        for (int j : a) {
            set.add(j);
        }
        Integer[]b=set.toArray(new Integer[0]);
        for (Integer i:b) {
            System.out.println(i);

        }
    }
}
