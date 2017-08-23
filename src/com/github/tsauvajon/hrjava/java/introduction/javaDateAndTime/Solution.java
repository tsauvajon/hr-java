package com.github.tsauvajon.hrjava.java.introduction.javaDateAndTime;

import java.util.Calendar;
import java.util.Scanner;

public class Solution {
    private static String getDay(String day, String month, String year) {
        Calendar rightNow = Calendar.getInstance();

        int d = Integer.valueOf(day);
        int m = Integer.valueOf(month);
        int y = Integer.valueOf(year);

        rightNow.set(y, m - 1, d);

        switch (rightNow.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.MONDAY:
                return "MONDAY";
            case Calendar.TUESDAY:
                return "TUESDAY";
            case Calendar.WEDNESDAY:
                return "WEDNESDAY";
            case Calendar.THURSDAY:
                return "THURSDAY";
            case Calendar.FRIDAY:
                return "FRIDAY";
            case Calendar.SATURDAY:
                return "SATURDAY";
            default:
                return "SUNDAY";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }
}