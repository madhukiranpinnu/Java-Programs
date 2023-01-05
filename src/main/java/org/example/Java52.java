package org.example;

public class Java52 {
    public static void main(String[] args) {
        //remove special char spaces from string
        String s="madhu@34411^&";
        String n=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(n);
    }
}
