package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.*;

public class Java134 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        List<Integer> l=new ArrayList<>();
        for(int a1:a){
            l.add(a1);
        }
        Collections.reverse(l);
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
    }
}
