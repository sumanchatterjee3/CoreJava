package com.suman.hackerrank;

import java.util.Scanner;

public class PrintIntegerArrayInReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n>=1 && n<=1000){
            int[] A = new int[n];
            for(int i=0; i<=n-1;i++){
                A[i] = scanner.nextInt();
            }
            for(int j=A.length-1;j>=0;j--){
                System.err.print(A[j]);
            }
        }
        else{
            System.err.print("Invalid Array Size");
        }
    }

}
