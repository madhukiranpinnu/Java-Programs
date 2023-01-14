package org.example;

import java.util.*;

public class Java117 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        List<String> a= Arrays.asList(s.split(" "));
        Collections.reverse(a);
        Iterator iterator=a.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
