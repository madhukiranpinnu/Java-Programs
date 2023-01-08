package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java84 {
    public static void main(String[] args) {
        Integer[] a={1,2,3,4,5,6,1,2,3,3,3};
        List<Integer> l= Arrays.asList(a);
        Collections.sort(l);
        System.out.println(l);
    }
}
