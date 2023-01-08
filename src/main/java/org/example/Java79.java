package org.example;

import java.util.Arrays;
import java.util.Collections;

public class Java79 {
    public static void main(String[] args) {
        Integer a[]={3,5,1,3,5,9,1,5};
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
    }
}
