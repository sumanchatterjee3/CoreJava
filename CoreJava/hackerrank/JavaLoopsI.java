package com.suman.hackerrank;

import java.util.*;

public class JavaLoopsI {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if (N >= 2 && N <= 20) {
            for (int i = 1; (i >= 0 && i <= 10); i++) {
                int multiple = N * i;
                System.err.print(N + " x " + i + " = " + multiple);
            }
        } else {
            System.err.print("Invalid Input");
        }
    }
}