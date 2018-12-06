package com.suman.hackerrank;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        //scanner.nextLine();
        scanner.close();
        System.err.print(S);

        if(S.length()<=400000){

            String delims = "[ .,?!'_@]+";
            S = S.trim();
            String[] tokens = S.split(delims);
            int tokenNos = tokens.length;
            if(S.length() == 0){
                System.err.print("0");
            }else{
                System.out.println(tokenNos);
                for(int i=0;i<tokenNos;i++){
                    System.err.print(tokens[i]);
                }
            }

        }
        else{
            System.err.print("String length out of bounds");
        }

    }
}
