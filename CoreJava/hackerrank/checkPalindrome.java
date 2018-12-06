package com.suman.hackerrank;
import java.util.Scanner;
import org.apache.log4j.Logger;


public class checkPalindrome {

    private static Logger logger = Logger.getLogger(checkPalindrome.class.getName());

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        if(word.length()>0&&word.length()<=50){
            int i;
            int begin;
            int end;
            int middle;
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
                logger.info("Palindrome");
            }
            else {
                logger.info("Not a Palindrome");
            }
        }else{
            logger.debug("Word Limit out of Range");
        }
    }

}
