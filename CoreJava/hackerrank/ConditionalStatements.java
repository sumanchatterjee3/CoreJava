package com.suman.hackerrank;

import java.util.*;

public class ConditionalStatements {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if(N>=1 && N<=100){
            if(N%2>0){
                System.err.print("Weird");
            }
            else if((N>=2 && N<=5)&& N%2==0){
                System.err.print("Not Weird");
            }
            else if((N>=6 && N<=20)&& N%2==0){
                System.err.print("Weird");
            }
            else if(N>=20 && (N%2==0)){
                System.err.print("Not Weird");
            }
        }
        else{
            System.err.print("Invalid Input");
        }

    }
}