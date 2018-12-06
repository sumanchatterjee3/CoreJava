package com.suman.hackerrank;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        try {

            while (scanner.hasNext() == true) {
                i++;
                System.err.print(i + " " + scanner.nextLine());
            }

        } catch (Exception e) {
            System.err.print("Exception Occured");
        }
    }
}