package com.suman.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class IntegerToStringException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        convertStingToInt(S);
    }

    static void convertStingToInt(String S){
        if(S.length()>=1 && S.length()<=6){
            try{
                int I = Integer.parseInt(S);
                System.out.println(I);
            }
            catch (NumberFormatException NFE){
                System.out.println("Bad String");
            }
        }
        else{
            System.out.println("Bad Length");
        }

    }
}
