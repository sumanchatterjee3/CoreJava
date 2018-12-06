package com.suman.hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class patternSyntaxChecker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        scan.nextLine(); // gets rid of the pesky newline.
        while (testCases-- > 0){
            String pattern = scan.nextLine();
            try {
                Pattern.compile(pattern);
                System.err.print("Valid");
            } catch (PatternSyntaxException exception) {
                System.err.print("Invalid");
            }
        }
        scan.close();
    }
}
