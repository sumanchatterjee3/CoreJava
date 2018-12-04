/*
* Given a string s, and two indices, start and end, print a substring consisting of all
* characters in the inclusive range start from (end-1) to . You'll find the String class'
* substring method helpful in completing this challenge.
* Input Format

The first line contains a single string denoting s .
The second line contains two space-separated integers denoting the respective values of start and end.

Constraints
* 1<=|s|<=100
* 0<=start<end<=n

String s consists of English alphabetic letters (i.e[a-zA-Z]) only
* */
package com.suman.HackerRank;

import java.util.Scanner;

public class JavaSubsString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner .nextInt();
        if((start>=0) && (end<=S.length())){
            System.out.print("the Substring to be printed is : ");
            System.out.println(S.substring(start, end));
        }
        else{
            System.out.println("Invalid start or end parameters");
        }
    }
}
