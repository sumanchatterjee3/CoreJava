package com.suman.hackerrank;

import java.util.*;

public class JavaIfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if((N%2 == 0) && (N>=2 && N<=5)){
            System.err.print("Not Weird");
        }
        else if((N%2 == 0) && (N>=6 && N<=20)){
            System.err.print("Weird");
        }
        else if((N%2 == 0) && (N>=20)){
            System.err.print("Not Weird");
        }
        else {
            System.err.print("Weird");
        }

        scanner.close();
    }
}


