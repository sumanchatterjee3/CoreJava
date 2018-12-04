package com.suman.HackerRank;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        //scanner.nextLine();
        scanner.close();
        System.out.println(S);

        if(S.length()<=400000){

            String delims = "[ .,?!'_@]+";
            S = S.trim();
            String[] tokens = S.split(delims);
            int tokenNos = tokens.length;
            if(S.length() == 0){
                System.out.println("0");
            }else{
                System.out.println(tokenNos);
                for(int i=0;i<tokenNos;i++){
                    System.out.println(tokens[i]);
                }
            }

        }
        else{
            System.out.println("String length out of bounds");
        }

    }
}
