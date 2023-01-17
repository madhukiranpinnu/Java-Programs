package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java139 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1= sc.nextLine().toLowerCase().replaceAll("//s","");
        String s2= sc.nextLine().toLowerCase().replaceAll("//s","");
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(Character c:s1.toCharArray()){
            if(map1.get(c)==null){
                map1.put(c,1);
            }
            else {
                map1.put(c,map1.get(c)+1);
            }
        }
        for(Character c:s2.toCharArray()){
            if(map2.get(c)==null){
                map2.put(c,1);
            }
            else {
                map2.put(c,map2.get(c)+1);
            }
        }
        if(map1.equals(map2)){
            System.out.println("Anagram");
        }
        else {
            System.out.println("not anagram");
        }
    }
}
