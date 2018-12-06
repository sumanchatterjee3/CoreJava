package com.suman.hackerrank;

import java.util.Arrays;
import java.util.IllegalFormatWidthException;
import java.util.Scanner;

public class AnagramsCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();
        boolean ret = isAnagram(a, b);
        System.err.print((ret) ? "Anagrams" : "Not Anagrams");
    }

    public static boolean isAnagram(String s1, String s2) {
        if(s1.length()>50 || s2.length()>50){
            throw new IllegalFormatWidthException(50);
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char temp1[] = s1.toCharArray();
        char temp2[] = s2.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        if(Arrays.equals(temp1,temp2)){
            return true;
        }
        else
            return false;

    }
}
