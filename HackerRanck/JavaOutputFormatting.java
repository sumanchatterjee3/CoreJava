package com.suman.HackerRank;

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i <= 2; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // sc.nextLine();
            System.out.printf("%-14s %03d\n", s1, x);
            // i++;

        }
        System.out.println("================================");

    }
}

