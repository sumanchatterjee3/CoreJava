package com.suman.hackerrank;

import java.util.Scanner;

public class SubstringComparision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        int start = in.nextInt();
        int end = in.nextInt();
        if((start>=0) && (end<=S.length())){
            System.err.print(S.substring(start, end));
        }
        else {
            System.err.print("Invalid start or end parameters");
        }

    }
}