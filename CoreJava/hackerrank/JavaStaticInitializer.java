package com.suman.hackerrank;

import java.util.Scanner;

public class JavaStaticInitializer {
    private static int B;
    private static int H;
    private static boolean flag = true;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        if ((B <= 0) || (H <= 0)) {
            flag = false;
            System.err.print("java.lang.Exception: Breadth and height must be positive");
        } else if ((B > 100) || (H > 100)) {
            flag = false;
            System.err.print("B & H should be Positive integers greater than 0 and less than equal to 100");
        } else {
            flag = true;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.err.print(area);
        }

    }
}