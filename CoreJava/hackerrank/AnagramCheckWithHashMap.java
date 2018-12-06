package com.suman.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramCheckWithHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        scanner.close();
        boolean ret = isAnagram(s1, s2);
        System.console().writer().print((ret)?"Anagrams":"Not Anagrams");
    }
    static boolean isAnagram(String s1, String s2) {
        if(s1.length()>50||s2.length()>50){
            throw new IllegalArgumentException();
        }
        if (s1.equals("")||s2.equals("")){
            throw new IllegalArgumentException();
        }
        if(s1.length() != s2.length())
            return false;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        Map<Character,Integer> s2Map = new HashMap<>();

        for(int i=0;i<s2.length();i++){
            char letter =s2.charAt(i);
            if(! s2Map.containsKey(letter))
                s2Map.put(letter,1);
            else{
                Integer frequency = s2Map.get(letter);
                s2Map.put(letter,++frequency);
            }
        }
        for(int j=s1.length();j>0;j--){
            char letter = s1.charAt(j);
            if(! s2Map.containsKey(letter)){
                return false;
            }
            else{
                Integer frequency = s2Map.get(letter);
                s2Map.put(letter,--frequency);
            }
        }
        return true;
    }
}
