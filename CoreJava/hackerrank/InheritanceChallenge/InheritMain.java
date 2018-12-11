package com.suman.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class InheritMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        ArrayList<Integer> testScores = new ArrayList<>(numScores);
        for(int i = 0; i < numScores; i++){
            testScores.add(scan.nextInt());
        }
        scan.close();

        InheritStudent s = new InheritStudent(firstName, lastName, id, testScores);
       // s.printPerson();
        //s.getSum(s.getScores());
       // System.out.println(s.getScores());
        System.out.println("Grade: " + s.calculate() );
       //System.out.println(s.calculate());
    }
}
