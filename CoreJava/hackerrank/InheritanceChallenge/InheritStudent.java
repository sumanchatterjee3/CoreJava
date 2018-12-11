package com.suman.hackerrank;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class InheritStudent extends InheritPerson {
    private Vector<Integer> scores;
    private int sum=0;
    private char ch;
    private int Average=0;

    InheritStudent(String fname, String lName, int Identification, ArrayList testScores) {
        super(fname, lName, Identification);
        this.scores = new Vector<>(testScores.size());
        this.scores.addAll(testScores);
    }

    public Vector<Integer> getScores() {
        return this.scores;
    }
    private int getSum(){
        Enumeration E = this.scores.elements();
       // Iterator IE = this.scores.iterator();
        while(E.hasMoreElements()){
            sum += (int)E.nextElement();
        }
        return sum;
    }
    private int getAverage(){
      Average = getSum()/scores.size();
      return Average;
    }
   char calculate(){
        getAverage();
        if(Average>=90 && Average<=100)
            ch = 'O';
        else if(Average>=80 && Average<=89)
            ch = 'E';
        else if(Average>=70 && Average<=79)
            ch = 'A';
        else if(Average>=55 && Average<=69)
            ch = 'P';
        else if(Average>=40 && Average<54)
            ch = 'D';
        else if (Average<40)
            ch = 'T';
        return ch;
    }

}
