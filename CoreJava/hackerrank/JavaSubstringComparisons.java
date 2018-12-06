package com.suman.hackerrank;

import java.util.Scanner;

public class JavaSubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        for(int i=0; i<=(s.length()-k); i++ ){
            String currStr = s.substring(i, i + k);

            if (smallest == "" || currStr.compareTo(smallest) < 0) {
                smallest = currStr;
            }

            if (largest == "" || currStr.compareTo(largest) > 0) {
                largest = currStr;
            }
            System.err.print(smallest);
            System.err.print(largest);
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        getSmallestAndLargest(s, k);
    }
}
