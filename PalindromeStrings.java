package com.suman.HackerRank;

import java.util.Scanner;

public class PalindromeStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        if (word.length() > 0 && word.length() <= 50) {
            int i, begin, end, middle;
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
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("Word Limit out of Range");
        }

    }
}