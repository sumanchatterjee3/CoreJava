package com.suman.hackerrank;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class GetSmallestAndLargestSubstring {
    private static final Logger logger = Logger.getLogger(GetSmallestAndLargestSubstring.class);
    public static String getSmallestAndLargestSubstring(String str, int k){
        String smallest = "";
        String largest = "";
        if(str.length()>=1 && str.length()<=1000){
            for(int i =0 ; i<str.length()-k+1 ; i++){
                String subString = str.substring(i,i+k);
                if(i == 0){
                    smallest=subString;
                }
                if(subString.compareTo(largest)>0){
                    largest=subString;
                }
                else if(subString.compareTo(smallest)<0){
                    smallest = subString;
                }
            }
        }
        else{
            logger.error("Invalid Input");
            return null;
        }

        return smallest +"\n"+largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int k = scanner.nextInt();
        scanner.close();
        logger.info(getSmallestAndLargestSubstring(str,k));
    }
}
