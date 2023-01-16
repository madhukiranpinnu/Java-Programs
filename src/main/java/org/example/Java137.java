package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Java137 {
    public static void main(String[] args) throws ParseException {
        String s="2023-JAN-16";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MMM-DD");
        Date date=simpleDateFormat.parse(s);
        System.out.println(date);
    }
}
