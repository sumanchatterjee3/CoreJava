package com.suman.HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class AdditionAndMultiplicationUsingBigIntegers {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        try{
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            if(a.bitLength()<=0 || b.bitLength()<=0){
                throw new IllegalArgumentException();
            }

            System.out.println(a.add(b));
            System.out.println(a.multiply(b));
        }
        catch (IllegalArgumentException e1){
            e1.printStackTrace();
        }
    }
}
