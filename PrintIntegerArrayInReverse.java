package com.suman.HackerRank;

import java.util.Scanner;

public class PrintIntegerArrayInReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the size of Integer Array: ");
        int n = scanner.nextInt();
        if(n>=1 && n<=1000){
            int[] A = new int[n];
            for(int i=0; i<=n-1;i++){
                A[i] = scanner.nextInt();
            }
            for(int j=A.length-1;j>=0;j--){
                System.out.print(A[j]);
            }
        }
        else{
            System.out.println("Invalid Array Size");
        }
    }

}
