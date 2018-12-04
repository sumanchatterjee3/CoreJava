package com.suman.HackerRank;

import java.time.*;

public class CalendarPrinter {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        LocalDateTime firstDay = date.minusDays(today - 1);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int value = dayOfWeek.getValue();

        System.out.println("MON TUE WED THU FRI SAT SUN");

        for (int i = 0; i < value; i++) {
            System.out.println(" ");
        }
        while (date.getMonthValue() == month) {
            System.out.println(("%3d\n") + date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.println("*");
            } else {
                System.out.println(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
            if (date.getDayOfWeek().getValue() != 1) System.out.println();
        }

    }

}
