/*
* Given two strings of lowercase English letters,  and , perform the following operations:
Sum the lengths of A and B
Determine if A is lexicographically larger than B (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in A and B and print them on a single line, separated by a space.
* */

package com.suman.HackerRank;

import java.util.Scanner;

public class JavaStringLexicographic {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        System.out.println((A.substring(0, 1).toUpperCase()) + (A.substring(1, A.length())) + " " +
                (B.substring(0, 1).toUpperCase()) + (B.substring(1, B.length())));


    }
}
