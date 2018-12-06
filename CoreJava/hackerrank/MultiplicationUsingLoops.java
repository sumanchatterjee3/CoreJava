package com.suman.hackerrank;

import java.util.*;

public class MultiplicationUsingLoops {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if(n<2 || n>20){
            System.err.print("Invalid input parameter.");
        }
        else{
            for(int i = 1;i <= 10; i++){
                System.err.print(n+" x "+i+" = "+(n*i));
            }
        }
    }
}
