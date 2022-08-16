package org.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date newDate = new Date();
        Date secondDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("E, MMMM d 'at' hh:mm a");
        String[] names = {"kajela", "tito"};
        String[] values = {"marks", "2", "4"};
        String startDateString = "07/7/2017";
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date startDate;
        try {
            startDate = df.parse(startDateString);
            SimpleDateFormat ft = new SimpleDateFormat ("E, MMMM d"); //formatter pattern
            System.out.println("Date that was formerly a String, formatted: " + ft.format(startDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (String name : names) {


            for (String value : values) {
                System.out.println(name + " of " + value);

            }
            System.out.println(newDate.toString());
            System.out.println("current date: " + sdf.format(secondDate));
        }

    }
}