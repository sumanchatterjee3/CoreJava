package com.suman.hackerrank;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class CheckNewPalindrome {
    private static final Logger logger = Logger.getLogger(CheckNewPalindrome.class);
    public static void main(String[] args) {
        String original, reverse ="";
        Scanner scanner = new Scanner(System.in);
        original = scanner.next();
        int length = original.length();
        for(int i= length-1;i>=0;i--){
            reverse = reverse + original.charAt(i);
        }
        if(original.equals(reverse)){
            logger.info("Yes");
        }else{
            logger.info("No");
        }
    }
}
