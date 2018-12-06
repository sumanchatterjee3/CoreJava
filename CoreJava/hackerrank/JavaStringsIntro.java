package com.suman.hackerrank;

import java.util.Scanner;

public class JavaStringsIntro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.err.print(A.length() + B.length());
        System.err.print(A.compareTo(B) > 0 ? "Yes" : "No");
        System.err.print((A.substring(0, 1).toUpperCase()) + (A.substring(1, A.length())) + " " + (B.substring(0, 1).toUpperCase())
                + (B.substring(1, B.length())));


    }
}
