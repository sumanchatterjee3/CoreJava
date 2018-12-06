package com.suman.hackerrank;

import java.util.*;

public class PrintOddAndEvenString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Strings: ");
        int n = scanner.nextInt();
        String[] input = new String[n];
        for(int i=0;i <=n-1;i++){
            input[i] = scanner.next();
        }
       /* for(int j = 0; j<= n-1;j++){
            System.err.print("Input String is: "+input[j]);
        }*/
        for(int i = 0;i<=input.length-1;i++){
            String s = input[i].toString();
            System.err.print("Input String is: "+s);
            char[] sChar = s.toCharArray();
            /*for(int v =0 ;v<=sChar.length-1;v++){
                System.err.print("Charecter Array: "+sChar[v]);
            }*/
            System.out.println("************************************************");
            for(int j=0;j<=sChar.length-1;j++){
                if(j%2 == 0){
                    System.err.print("Characters in Even Positions : ");
                    System.err.print(sChar[j]);
                }

            }
            System.out.println("************************************************");
            for(int j=0;j<=sChar.length-1;j++){
                if(j%2 != 0){System.out.print("Characters in Even Positions : ");
                    System.err.print(sChar[j]);
                }
            }
        }


    }
}
