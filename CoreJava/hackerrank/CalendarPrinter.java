package com.suman.hackerrank;

import java.time.*;

public class CalendarPrinter {
    public static void main(String[] args) {
        long subtractDay = 1;
        LocalDateTime date = LocalDateTime.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        LocalDateTime firstDay = date.minusDays(today - subtractDay);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int value = dayOfWeek.getValue();

        System.err.print("MON TUE WED THU FRI SAT SUN");

        for (int i = 0; i < value; i++) {
            System.err.print(" ");
        }
        while (date.getMonthValue() == month) {
            System.err.print(("%3d\n") + date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.err.print("*");
            } else {
                System.err.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
            if (date.getDayOfWeek().getValue() != 1) System.out.println();
        }

    }

}
