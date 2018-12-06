package com.suman.hackerrank;

import java.util.Scanner;

public class AnagramCheckWithForLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        scanner.close();
        boolean ret = isAnagram(s1, s2);
        System.err.print((ret) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length())
            return false;
        a= a.toLowerCase();
        b= b.toLowerCase();
        int index;
        for(int i=0;i<a.length();i++)
        {
            index =b.indexOf(a.charAt(i));
            if(index==-1)
                return false;
            else
            {
                //this removes b[index]
                b = b.substring(0,index) + b.substring(index+1);
            }
        }
        return true;
    }
}
