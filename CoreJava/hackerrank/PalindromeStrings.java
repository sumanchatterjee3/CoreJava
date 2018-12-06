package com.suman.hackerrank;

import java.util.Scanner;

public class PalindromeStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        if (word.length() > 0 && word.length() <= 50) {
            int i;
            int begin;
            int end;
            int middle;
            begin = 0;
            end = word.length() - 1;
            middle = (begin + end) / 2;

            for (i = begin; i <= middle; i++) {
                if (word.charAt(begin) == word.charAt(end)) {
                    begin++;
                    end--;
                } else {
                    break;
                }
            }
            if (i == middle + 1) {
                System.err.print("Yes");
            } else {
                System.err.print("No");
            }
        } else {
            System.err.print("Word Limit out of Range");
        }

    }
}