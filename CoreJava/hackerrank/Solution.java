package com.suman.hackerrank;
import java.util.*;

public class Solution {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        //double finalCost = (meal_cost+((tip_percent/100)*meal_cost)+((tax_percent/100)*meal_cost));
        //

        double cost = meal_cost;
        double  tipPercent = tip_percent;
        double taxPercent = tax_percent;

        double finalCost = (cost+((tipPercent/100)*meal_cost)+((taxPercent/100)*meal_cost));
        System.err.print(" tip: "+((tipPercent/100)*meal_cost)+"\ntax: "+((taxPercent/100)*meal_cost));
        System.err.print(finalCost);
        System.err.print(Math.round(finalCost));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}

