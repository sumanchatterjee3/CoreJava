package com.suman.hackerrank;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int series[];
            int addTwos = 0;
            series = new int[n];
            for (int j = 0; j < n; j++) {
                int twos = (int) ((Math.pow(2, j)) * b);
                addTwos += twos;
                series[j] = a + addTwos;
                System.err.print(series[j] + " ");
            }
            System.err.print("");
        }
        in.close();
    }
}