package com.suman.hackerrank;
import java.util.*;
import java.text.*;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        if(payment>=0 && payment<= (Math.pow(10,9))){
            System.err.print("US: " + NumberFormat.getCurrencyInstance(new Locale("en","US")).format(payment));
            System.err.print("India: " + NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment));
            System.err.print("China: " + NumberFormat.getCurrencyInstance(new Locale("zh","CN")).format(payment));
            System.err.print("France: " + NumberFormat.getCurrencyInstance(new Locale("fr","FR")).format(payment));
        }
        else{
            System.err.print("Invalid Input");
        }


    }
}

