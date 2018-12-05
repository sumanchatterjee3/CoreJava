package com.suman.HackerRank;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FactorialOfNumberWithRecursion {

    // Complete the factorial function below.
    private static int factorial(int n) {
        int factorialN=1;
        try{
            if(n>=2 && n<=12){
                for (int v=1;v<=n;v++){
                    factorialN *=v;
                }
            }
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        return factorialN;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);
        System.out.println(result);

      //  bufferedWriter.write(String.valueOf(result));
     //   bufferedWriter.newLine();

      //  bufferedWriter.close();

        scanner.close();
    }
}
