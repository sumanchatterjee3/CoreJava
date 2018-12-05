package com.suman.HackerRank;

import java.util.Scanner;

@SuppressWarnings("ConstantConditions")
public class BinaryNumbers {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int number = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        getBinary(number);

    }

    private static void getBinary(int n) {
        int counter = 1;
        int flag = 1;
        int[] binaryNumber = new int[100];
        int i = 0;
        try {
            while (n >= 1 && n <= 1000000) {
                binaryNumber[i] = n % 2;
                n /= 2;
                i++;
            }
            for (int v = (i - 1); v >= 1; v--) {
                System.out.print(binaryNumber[v] + "\n");
                if (binaryNumber[v] == 1) {
                    if (binaryNumber[v] == binaryNumber[v - 1]) {
                        counter++;
                    } else {
                        counter = 1;
                        flag = flag;
                    }
                    if (counter > flag) {

                        flag = counter;
                    } else {
                        flag = flag;
                    }
                }

            }
            System.out.println("****************");
            System.out.println(flag);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
