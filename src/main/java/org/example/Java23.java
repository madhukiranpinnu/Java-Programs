package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Java23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        char[] ch=s.toCharArray();
        for (char c1:ch) {
            if(map.containsKey(c1)){
                map.put(c1,map.get(c1)+1);
            }
            else {
                map.put(c1,1);
            }
        }
        for(char c1:ch){
            if(map.get(c1)>1){
                System.out.println(c1+" "+map.get(c1));
            }
        }
    }
}
