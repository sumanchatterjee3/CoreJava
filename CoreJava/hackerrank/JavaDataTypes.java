package com.suman.hackerrank;

import java.util.Scanner;

public class JavaDataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.err.print(x + " can be fitted in:");
                if (x >= -128 && x <= 127)
                    System.err.print("* byte");
                if (x >= -32768 && x <= 32767)
                    System.err.print("* short");
                if (x >= (Math.pow(-2, 31)) && x <= ((Math.pow(2, 31) - 1)))
                    System.err.print("* int");
                if (x >= (Math.pow(-2, 63)) && x <= (Math.pow(2, 63) - 1))
                    System.err.print("* long");
            } catch (Exception e) {
                System.err.print(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}