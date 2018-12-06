package com.suman.hackerrank;

public class returnHashCode {
    public static void main(String[] args) {
        String s = "suman";
        String t = "suma";
        System.out.println(s.hashCode());
        System.out.println(s.hashCode());
        if(s.equals(t)){
            System.err.print("True");
        }
        else{
            System.err.print("False");
        }
    }
}
