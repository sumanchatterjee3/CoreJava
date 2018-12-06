package com.suman.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class checkPrimeNumberWithJavaBigInteger {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

       try{
           BigInteger n = scanner.nextBigInteger();
           if(n.bitLength()>0 && n.bitLength()<=100){ //Checking the bit length of the input number is less than or equal to 100
               System.err.print(n.isProbablePrime(1)?"Prime":"Not Prime");
               //n.isProbablePrime(1) checks if the number is prime or not.
           }
           else {
               throw new IllegalArgumentException();
           }

       }
       catch (Exception e){
           System.err.print(e);
       }

    }
}
