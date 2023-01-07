package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Java60 {
    public static void main(String[] args) {
        SimpleDateFormat pl=new SimpleDateFormat("dd-MM-yyyy");
        Date date=new Date();
        pl.format(date);
        System.out.println(pl.getCalendar());
    }
}
