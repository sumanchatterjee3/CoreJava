package com.suman.HackerRank;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        try {

            while (scanner.hasNext() == true) {
                i++;
                System.out.println(i + " " + scanner.nextLine());
            }

        } catch (Exception e) {
            System.out.println("Exception Occured");
        }
    }
}