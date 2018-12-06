package com.suman.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.logging.Logger;


public class AdditionAndMultiplicationUsingBigIntegers {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        try{
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            if(a.bitLength()<=0 || b.bitLength()<=0){
                throw new IllegalArgumentException();
            }


            System.err.print(a.add(b)+" "+a.multiply(b));



        }
        catch (IllegalArgumentException e1){
            Logger.getLogger(String.valueOf(e1));
            System.console().writer().print(e1);
        }
    }
}
