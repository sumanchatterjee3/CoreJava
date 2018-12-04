package com.suman.HackerRank;

import java.util.Scanner;

public class checkNewPalindrome {
    public static void main(String[] args) {
        String original, reverse ="";
        Scanner scanner = new Scanner(System.in);
        original = scanner.next();
        int length = original.length();
        for(int i= length-1;i>=0;i--){
            reverse = reverse + original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
