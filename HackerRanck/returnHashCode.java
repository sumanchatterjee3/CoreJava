package com.suman.HackerRank;

public class returnHashCode {
    public static void main(String[] args) {
        String s = "suman";
        String t = "suma";
        System.out.println(s.hashCode());
        System.out.println(s.hashCode());
        if(s.equals(t)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
