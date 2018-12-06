package com.suman.hackerrank;

import java.util.Scanner;

public class StandardInputOutputFromConsoleII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.err.print("String: " + s);
        System.err.print("Double: " + d);
        System.err.print("Int: " + i);
    }
}
