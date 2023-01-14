package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Java108 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int k = 1; k <=n; k++) {
            int last = a[0];
            for (int i = 0; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
            a[a.length - 1] = last;
        }
        System.out.println(Arrays.toString(a));
    }
}
