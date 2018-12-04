package com.suman.HackerRank;

import java.util.Scanner;

public class JavaStaticInitializer {
    public static int B;
    public static int H;
    public static boolean flag = true;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        if ((B <= 0) || (H <= 0)) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else if ((B > 100) || (H > 100)) {
            flag = false;
            System.out.println("B & H should be Positive integers greater than 0 and less than equal to 100");
        } else {
            flag = true;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }
}