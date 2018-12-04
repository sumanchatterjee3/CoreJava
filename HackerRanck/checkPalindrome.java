package com.suman.HackerRank;
import java.util.Scanner;
public class checkPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        if(word.length()>0&&word.length()<=50){
            int i,begin,end,middle;
            begin=0;
            end=word.length()-1;
            middle= (begin+end)/2;

            for (i=begin;i<=middle;i++){
                if(word.charAt(begin)==word.charAt(end)){
                    begin++;
                    end--;
                }
                else {
                    break;
                }
            }
            if(i==middle+1){
                System.out.println("Palindrome");
            }
            else {
                System.out.println("Not a Palindrome");
            }
        }else{
            System.out.println("Word Limit out of Range");
        }
    }

}
