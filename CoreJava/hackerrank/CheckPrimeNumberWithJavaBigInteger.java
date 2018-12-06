package com.suman.hackerrank;

import org.apache.log4j.Logger;

import java.math.BigInteger;
import java.util.Scanner;

public class CheckPrimeNumberWithJavaBigInteger {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(CheckPrimeNumberWithJavaBigInteger.class);

    public static void main(String[] args) {

       try{
           BigInteger n = scanner.nextBigInteger();
           if(n.bitLength()>0 && n.bitLength()<=100){ //Checking the bit length of the input number is less than or equal to 100
               logger.info(n.isProbablePrime(1)?"Prime":"Not Prime");
               //n.isProbablePrime(1) checks if the number is prime or not.
           }
           else {
               throw new IllegalArgumentException();
           }

       }
       catch (Exception e){
           logger.error(e);
       }

    }
}
