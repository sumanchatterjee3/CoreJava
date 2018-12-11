package com.suman.hackerrank;
import java.util.*;

class Difference {
    private int[] elements;
    int maximumDifference;

    Difference(int[] elements) {
        this.elements = elements;
    }

    void computeDifference(){
        int min =elements[0];
        int max = elements[0];
        for(int e:elements){
            min = Math.min(min,e);
            max = Math.max(max,e);
        }
        maximumDifference = max-min;
        
    }
}

public class ScopeChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}